package day_1;

// 몫 구하기
class Solution4 {
 public int solution(int num1, int num2) {
     int answer = 0;
     
     if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
    	 answer = num1 / num2;
     }
     return answer;
 }
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution4 sol = new Solution4();
		int answer = sol.solution(10, 5);
		System.out.println(answer);
		
	}

}