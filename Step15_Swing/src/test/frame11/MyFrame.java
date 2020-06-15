package test.frame11;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JTextField tf_num1, tf_num2;
	JLabel label_result;

	//default 생성자
	public MyFrame() {
		setLayout(new BorderLayout());
		
	//Panel
	JPanel topPanel=new JPanel();
	topPanel.setBackground(Color.CYAN);
	//Panel을 북쪽에 배치 하기
	add(topPanel, BorderLayout.NORTH);
	
	tf_num1=new JTextField(10);
	topPanel.add(tf_num1);
	JButton plusBtn=new JButton("+");
	JButton minusBtn=new JButton("-");
	JButton multiBtn=new JButton("*");
	JButton divideBtn=new JButton("/");
	topPanel.add(plusBtn);
	topPanel.add(minusBtn);
	topPanel.add(multiBtn);
	topPanel.add(divideBtn);
	//두번째 텍스트 필드 만들어서 패널에 추가.
	tf_num2=new JTextField(10);
	topPanel.add(tf_num2);
	//JLabel
	JLabel label1=new JLabel("=");
	label_result=new JLabel("0");
	//패널에 레이블 추가하기
	topPanel.add(label1);
	topPanel.add(label_result);
	
	//버튼에 리스너 등록하기
	plusBtn.addActionListener(this);
	minusBtn.addActionListener(this);
	multiBtn.addActionListener(this);
	divideBtn.addActionListener(this);
	
	//버튼에 액션 command 지정하기
	plusBtn.setActionCommand("plus");
	minusBtn.setActionCommand("minus");
	multiBtn.setActionCommand("multi");
	divideBtn.setActionCommand("divide");
	}
		
		
	public static void main(String[] args) {
		//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame에 담기
		MyFrame frame=new MyFrame();
		//프레임의 제목 설정
		frame.setTitle("나의 프레임");
		//프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
		//JFrame.EXIT_ON_CLOSE = 3 과 같은 의미를 가진다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField에 입력한 문자열을 읽어와서 숫자(실수)로 바꿔준다.
		double num1=Double.parseDouble(tf_num1.getText());
		double num2=Double.parseDouble(tf_num2.getText());
		//연산의 결과값을 담을 지역변수.
		double result=0;
		//눌러진 버튼의 command 읽어오기
		String command=e.getActionCommand();
		if(command.equals("plus")) {
			result=num1+num2;
		}else if(command.equals("minus")) {
			result=num1-num2;
		}else if(command.equals("multi")) {
			result=num1*num2;
		}else if(command.equals("divide")) {
			result=num1/num2;
		}
		//결과값을 JLabel에 출력하기
		label_result.setText(Double.toString(result));
//	}catch(Exception exe) {
//		JOptionPane.showMesseageDialog(this, "숫자 형식으로 입력해 주세요.")
		
	}

}
