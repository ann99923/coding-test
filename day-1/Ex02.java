package day_1;

// 두 수의 차
class Solution2 {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution2 sol = new Solution2();
		int answer = sol.solution(2, 3);
		System.out.println(answer);
		
	}

}
