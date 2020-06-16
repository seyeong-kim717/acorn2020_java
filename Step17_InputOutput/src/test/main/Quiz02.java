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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener  {
	JTextField tf_msg;
	
	//생성자
	public Quiz02() {
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		JPanel topPanel=new JPanel();
//		JTextField tf_msg=new JTextField(10); 객체의 참조값을 필드에 저장.
		JButton appendBtn=new JButton("추가하기");
		appendBtn.setActionCommand("append");
		
		//버튼 리스너 등록하기. 
		appendBtn.addActionListener(this);
		
		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.DARK_GRAY);
		
		
	}
	public static void main(String[] args) {
		Quiz02 f=new Quiz02();
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	//버튼을 누루면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//1.JTextField에 입력한 문자열을 읽어와서
		String str=tf_msg.getText();
		//2. memo.txt 파일에 저장하기
		File QuizFile=new File("c:/acorn2020/myFolder/memo.txt");
		
		try {
			boolean isExist=QuizFile.exists();
			if(!isExist) {
			QuizFile.createNewFile();
			}
			FileWriter fw=new FileWriter(QuizFile,true);//append 사용시 true사용시 내용을 이어 붙힐수 있다.
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
