package test.main;
/*
 * 버튼 눌렀을때 글이 텍스트 파일에 전달 되는 기능.
 * 1. 버튼 리스너 등록 먼저!
 * 2. 버튼을 누루면 호출되는 메소드 에 작성.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener  {
	JTextField tf_msg;
	JTextArea area;
	
	//생성자
	public Quiz02() {
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		JPanel topPanel=new JPanel();
//		JTextField tf_msg=new JTextField(10); 객체의 참조값을 필드에 저장.
		tf_msg=new JTextField(10);
		JButton appendBtn=new JButton("추가하기");
		JButton loadBtn=new JButton("불러오기");
		appendBtn.setActionCommand("append");
		loadBtn.setActionCommand("load");
		
		//버튼 리스너 등록하기. 
		appendBtn.addActionListener(this);
		loadBtn.addActionListener(this);
		
		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		topPanel.add(loadBtn);
		add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.DARK_GRAY);
		
		//JtextArea
		area=new JTextArea();
		//프레임의 가운데에  JtextArea 배치하기
		add(area, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		Quiz02 f=new Quiz02();
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	//버튼을 누루면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent event) {
		//눌러진 버튼의 액션 command읽어오기.
		String command=event.getActionCommand();
		if (command.equals("append")) {//추가 버튼을 눌렀을때
			append();
		}else if(command.equals("load")) {//불러오기 버튼을 눌렀을때
			load();
		}
	}
	//불러오기 작업을 하는 메소드
	public void load() {
		//JTextArea 를 한번 clear 하고
		area.setText("");
		//1. 파일에서 문자열을 읽어와서
		//2.JtextArea 에 출력하기
		File memoFile=new File("c:/acorn2020/myFolder/memo.txt");
		//필요한 객체의 참조값을 담을 지역 변수를 미리 만든다.
		FileReader fr=null;
		BufferedReader br=null;
		try {
			if (!memoFile.exists()) {
				System.out.println("파일이 없어요!");
				return; // 메소드 끝내기
			}
			//파일에서 문자열 읽어들일 객체
			fr=new FileReader(memoFile);
			br=new BufferedReader(fr);
			while(true) {
				//반복문 돌면서 문자열을 줄단위로 (개행기호 기준) 읽어 낸다.
				String line=br.readLine();
				if(line==null) {//더이상 읽을 문자열이 없으면
					break;//반복문 탈출
				}
				//읽은 문자열 JTextArea 에 출력하기 
				area.append(line);
				area.append("\r\n");//개행 기호도 출력해 준다.
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {//예외가 발생하던 안하던 반드시 실행이 보장되는 블럭.
			//마무리 작업을 한다(보통 열었던 스트림 객체를 닫는 작업을 한다.)
			try {
				//null 체크를 한 다음에 메소드를 호출해서 마무리 작업을 한다.
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			} catch (IOException e) {

			}
		}
	}
	//추가 작업을 하는 메소드
	public void append() {
		//1.JTextField에 입력한 문자열을 읽어와서
		String str=tf_msg.getText();
		//2. memo.txt 파일에 저장하기
		File memo1=new File("c:/acorn2020/myFolder/memo.txt");
		
		try {
			boolean isExist=memo1.exists();
			if(!isExist) {
				memo1.createNewFile();
			}
			FileWriter fw=new FileWriter(memo1,true);//append 사용시 true사용시 내용을 이어 붙힐수 있다.
			fw.append(str);
			fw.append("\r\n");
//			fw.flush();
			fw.close();//파일이 생성된다. 자동 flush 된다.
//			System.out.println("문자열을 저장 했습니다.");
			JOptionPane.showConfirmDialog(this, "저장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}
