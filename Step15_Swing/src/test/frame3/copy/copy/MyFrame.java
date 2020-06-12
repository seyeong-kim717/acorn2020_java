package test.frame3.copy.copy;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임의 레이아웃 매니저를 FlowLayout으로 지정한다.
//		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//레이아웃 매니저를 GridLayout로 지정하기 (2행 2열)
		setLayout(new GridLayout(4, 1));
		
		JButton btn1=new JButton("버튼1");
		add(btn1);
		
		JButton btn2=new JButton("버튼2");
		add(btn2);
		
		JButton btn3=new JButton("버튼3");
		add(btn3);
		
		JButton btn4=new JButton("버튼4");
		add(btn4);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
