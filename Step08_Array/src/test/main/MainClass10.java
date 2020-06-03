package test.main;

import java.util.Random;

public class MainClass10 {
	public static void main(String[] args) {
		/*	cherry, apple, banana, melon, 7
		 * 	
		 *  5개의 문자열 중에서 3개가 한줄에 한버에 랜덤하게 출력되게 해보세요
		 *  ex) cherry | apple | cherry
		 *  7 | apple | melon
		 *  7 | 7 | 7
		 *  
		 *  cherry | cherry | cherry
		 *  10점 입니다.
		 *  
		 *  apple | apple | apple
		 *  20점입니다.
		 *  
		 *  7 | 7 | 7
		 *  1000점 입니다.
		 *  
		 *  apple | cherry | apple
		 *  0점 입니다.
		 */
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
