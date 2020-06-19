package example3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientMain extends JFrame implements ActionListener{
	//필드
	JTextField tf_msg;
	
	//생성자 동작의 구성과 ui구현은 생성자에서
	public ClientMain() {
		//레이아웃을 BorderLayout으로 지정하기
		setLayout(new BorderLayout());
		
		//패널
		JPanel panel=new JPanel();
		panel.setBackground(Color.PINK);
		//입력창
		tf_msg=new JTextField(10);
		//버튼
		JButton sendBtn=new JButton("전송");
		sendBtn.setActionCommand("send");
		//패널에 입력창과 버튼을 추가
		panel.add(tf_msg);
		panel.add(sendBtn);
		//프레임의 아래쪽에 패널 배치하기
		add(panel, BorderLayout.SOUTH);
		//
		sendBtn.addActionListener(this);
	}
	public static void main(String[] args) {
		//프레임 객체 생성
		ClientMain f=new ClientMain();
		f.setTitle("채팅창");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//전송할 문자열
		String msg=tf_msg.getText();
		
		Socket socket=null;
		try {
			socket=new Socket("192.168.0.30",5000);
			System.out.println("Socket 연결 성공!");
			//문자열을 서버에 전송(출력Output) 하기
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			osw.write(msg);
			osw.write("\r\n");//개행기호도 출력 (서버에서 줄단위로 읽어낼 예정)
			osw.flush();
			osw.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally {
			try {
				if(socket!=null)socket.close();
			} catch (Exception e2) {}
			}
	}
	}
