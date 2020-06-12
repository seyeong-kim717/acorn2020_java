package test.frame7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	//필드 정의 하기
	JButton sendBtn;
	JButton removeBtn;
	

	//default 생성자
	public MyFrame() {
		//MyFrame의 레이아웃 매니저 지정하기.
		setLayout(new FlowLayout());
		//버튼
		this.sendBtn=new JButton("전송");
		removeBtn=new JButton("삭제");
		
		
		//프레임에 버튼 추가 하기(FlowLayout의 영향을 받는다.)
		add(sendBtn);
		add(removeBtn);

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

	//ActionListener 인터페이스를 구현해서 강제 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생한 UI(JButton) 의 참조값을 얻어온다.
		Object obj=e.getSource();
		//지역변수에 담는 값을 담을수 없다. 필드에 담긴값을 담아야 한다.
		//지역변수에서 만든 값을 참조 하려고 할려면 필드를 생성하여야 한다. 지역변수는 선언된 메소드에서만 사용가능 
		//필드를 선언하면 다른 메소드에서도 사용이 가능하기 때문이다.
		if(obj == sendBtn) {
			JOptionPane.showMessageDialog(this, "전송");
		}else if(obj == removeBtn){
			JOptionPane.showMessageDialog(this, "삭제");
		}
		
	}
}
