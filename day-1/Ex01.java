package day_1;

// 두 수의 합
class Solution1 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Solution1 sol = new Solution1();
			int answer = sol.solution(100, 2);
			System.out.println(answer);
	}

}
