package example9;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientMain extends JFrame{
	public ClientMain() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.ORANGE);
		JTextField tf_msg=new JTextField(10);
		
		JButton sendbtn=new JButton("전송");
		sendbtn.setActionCommand("send");
		panel.add(tf_msg);
		panel.add(sendbtn);
		add(panel, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		ClientMain f=new ClientMain();
		f.setTitle("연습 해보자!");
		f.setBounds(200, 200, 600, 600);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}