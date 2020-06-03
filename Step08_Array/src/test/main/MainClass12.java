package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("종료(q) 계속(Enter):");
			String str=scan.nextLine();
			if(str.equals("q")) {//무한루프 탈출 조건
				break;//while 문 탈출
			}
			System.out.println("무언가 작업 합니다.");
			//이전 예제에서 작업한 내용을 static 메소드에 이동 시키고 해당 메소드 호출하기
			MainClass12.doGame();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}

public static void doGame() {
	String[] sc = {"cherry", "apple", "banana", "melon", "7"};	
	Random ran=new Random();
	int[] nums = new int[3];
	for (int i = 0; i < 3; i++) {
		int a=ran.nextInt(5);
		nums[i]=a;
	}
	int one=nums[0];
	int two=nums[1];
	int three=nums[2];
	
	for (int i=0; i<nums.length; i++) {
		try {
			//실행의 흐름을(스레드)을 1초 잡아 놓기
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//.print()메소드를 이용해서 개행기호를 출력하지 않는다.
		System.out.print("|\t"+sc[nums[i]]+"\t|");
	}
	//개행 두번 하기
	System.out.println();
	System.out.println();
	
	
	//출력할 문자열 구성하기
	String line=sc[one]+" | "+sc[two]+" | "+sc[three] ;
	System.out.println(line);
	//부여할 점수를 미리 배열에 담아놓는다
	int[] points = {10, 20, 30, 40, 1000};
	if (nums[0] == nums[1] && nums[1] == nums[2]) { //3개가 모두 같은 경우
		int point=points[nums[0]]; //nums[0] = 0or1or2or3or4 이다 아무것이나 들어가도 괜찮음.
		//points[nums[0]]= 10 or 20 or 30 or 40 or 1000
		System.out.println(point+"점 입니다." );
		//점수를 부여해야 한다. 몇점이지?
		//nums 배열에 있는 숫자 3개가 다 같으므로 아무거나 하나를 읽어와서
		//점수를 얻어낸다.
	}else{//하나라도 다른 경우
		//0점
		System.out.println("0점입니다." );
	}
	
}
}

