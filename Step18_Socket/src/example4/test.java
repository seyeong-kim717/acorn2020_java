package example4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test extends JFrame implements ActionListener {
	JTextField msg;
	JTextArea ja;
	
	public test() {//동작의 구성과 ui구현은 생성자에서.
		//레이아웃을 borderlayout으로
		setLayout(new BorderLayout());
		//패널 추가
		JPanel panel=new JPanel();
		panel.setBackground(Color.darkGray);
		//텍스트필드 생성
		msg=new JTextField(10);
		//버튼
		JButton btn=new JButton("추가");
		btn.setActionCommand("전송");
		//패널에 필드 버튼 추가.
		panel.add(msg);
		panel.add(btn);
		
		add(panel, BorderLayout.SOUTH);
		
		btn.addActionListener(this);
		
		ja=new JTextArea();
		ja.setEditable(true);
	}
	
	public static void main(String[] args) {
		test t=new test();
		t.setTitle("연습삼아");
		t.setBounds(100, 100, 500, 500);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
			String str=msg.getText();
			ja.setText(str);
			
	}
}
