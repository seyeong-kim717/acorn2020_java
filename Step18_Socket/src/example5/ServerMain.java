package example5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
/*
 * 떨어져 있는 컴퓨터 끼리 통신 할수 있는 예제 만들어 보기.
 */
public class ServerMain {
	//static 필드 (스테틱 메소드 이기 때문에 스테틱 선언 해야 사용 가능)
	static List<ServerThread> threadList= new ArrayList<>();

	public static void main(String[] args) {
		//필요한 객체를 저장 할 지역변수 미리 만들기
		ServerSocket serverSocket=null;
		try {
			//5000번 통신 port를 열고 클라이언트의 접속을 기다린다.
			serverSocket=new ServerSocket(5000);
			while(true) {
			//클라이언트의 소커ㅔㅅ 접속을 기다린다.
			System.out.println("클라이언트의 Socket 연결 요청을 대기 합니다.");
			Socket socket=serverSocket.accept();
			System.out.println("클라이언트가 접속을 했습니다.");
			//방금 접속한 클라이언트를 응대할 스레드를 시작 시킨다
			ServerThread thread=new ServerThread(socket);
			thread.start();
			//생성하고 시작한 스레드의 참조값을 List에 저장하기
			threadList.add(thread);//ServerMain.이 생략 되어 있음. 같은 스테틱 자원 이기 때문에.
			
			
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (serverSocket!=null)serverSocket.close(); 
					
				}catch(Exception e) {}
			}
		}
	//내부 클래스로 스레드 객체를 생성할 클래스를 정의한다.
	//static main()메소드에서 클래스를 사용하기 위해  static 예약어를 붙혀서 사용한다.
	public static class ServerThread extends Thread{
		//필드
		Socket socket;//지금은 선언만 하면 null이 생성 그래서 생성자 필요!
		//클라이언트에게 출력할 수 있는 문자열의 객체 
		BufferedWriter bw;
		//클라이언트의 대화명을 저장할 필
		String chatName;
		
		//생성자
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달받은 Socket객체의 참조값을 필드에 저장한다.
			this.socket=socket;
		}
		//인자로 전달된 문자열을 출력하는 메소드
		public void sendMessage(String msg) throws IOException {
			//반복문 돌면서 모든 스레드의 BufferedWriter 객체를 이용해서
			//문자열을 전송한다.
			for (ServerThread tmp : threadList) {
				tmp.bw.write(msg);//문자열 출력
				tmp.bw.newLine();//개행기호 출력
				tmp.bw.flush();//방출
			}
		}
		
		
		//새로운 작업 단위가 시작되는 run() 메소드
		@Override
		public void run() {
			try {
				String clientIp=socket.getInetAddress().getHostAddress();
				System.out.println("접속한 클라이언트의 아이피 :"+clientIp);
				//클라이언트로 부터 읽어들일 (Input) 객체의 참조값 얻어오기
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				//BufferedReader 객체의 참조값을 필드에 저장하기
				BufferedReader br=new BufferedReader(isr);
				
				//클라이언트에게 출력할수 있는 객체
				OutputStream os=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(os);
				bw=new BufferedWriter(osw);
				
				while(true) {
					/*
					 * 클라이언트가문자열을 한줄 (개행기호와 함께) 보내면
					 * readLine()메소드가 리턴하면서 보낸 문자열을 가지고 온다.
					 * 보내지 않으면 계속 블로킹 되어서 대기하고 있다가
					 * 접속이 끊기면 Exception이 발생하거나 혹은 null이
					 * 리턴된다.
					 * 따라서 null이 리턴되면 반복문을 빠져나가게  break문을 만나도록 
					 * 한다.
					 * 실행순서가 try블럭을 벗어나면 run()메소드가 리턴하게 되고
					 * run() 메소드가 리턴되면 해당 스레드는 종료가 된다.
					 */
					//클라이언트가 전송하는 문자영을 읽어낸다
					String msg=br.readLine();
					//전송된 JSON 문자열 사용할 준비를 한다.
					JSONObject jsonObj=new JSONObject(msg);
					String type=jsonObj.getString("type");
					if (type.equals("enter")) {
						//현재 스레드가 대응한는 클라이언트의 대화명을 필드에 저장한다.
						String chatName=jsonObj.getString("name");
						this.chatName=chatName;
					}else if (type.equals("msg")) {
						
					}
					
					//클라이언트에게 동일한 메세지를 보내는 메소드를 호출한다.
					sendMessage(msg);
					if(msg==null) {//클라이언트의 접속이 끊겻기 때문에.
						break;//반복문을 빠져나오도록 한다.
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				//접속이 끊겨서 종료되는 스레드는 List에서 제거 한다.
				threadList.remove(this);//참조값을 찾아서 제거 가능.
				try {
					if(socket!=null)socket.close();
				}catch(Exception e) {}
			}
			
		}
	}
	}