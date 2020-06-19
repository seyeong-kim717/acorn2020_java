package test2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class AcornFrame extends JFrame implements ActionListener{
	
	public AcornFrame() {
		setLayout(new BorderLayout());
		JButton btn=new JButton("전송");
		add(btn, BorderLayout.NORTH);
		btn.addActionListener(this);
		btn.setActionCommand("send");
		
	}
	
	public static void main(String[] args) {
		AcornFrame f=new AcornFrame();
		f.setTitle("acorn");
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if (command.equals("send")) {//전송 버튼 눌렀을때
			JOptionPane.showMessageDialog(this, "전송");
	}
}
}
