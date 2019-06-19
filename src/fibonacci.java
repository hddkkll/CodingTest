/*
피보나치 수는 F(0) = 0, F(1) = 1일 때, 2 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 점화식입니다. 

2 이상의 n이 입력되었을 때, fibonacci 함수를 제작하여 n번째 피보나치 수를 반환해 주세요. 

예를 들어 n = 3이라면 2를 반환해주면 됩니다.

 */
/*
public class fibonacci {
	public static void main(String[] args) {
	Solution9 s = new Solution9();
	System.out.println(s.solution(3));
	}
}
class Solution9{
	public int solution(int n) {
		int answer = 0;
		int a = 0;
		int b = 1;
		if(n<=2)
			return 1;
		else {
			for(int i=1; i<n; i++) {
				answer=a+b;
				a=b;
				b=answer;
			}
		}
		return answer;
	}
}
*/

//다이나믹 프로그래밍(dp) 이용
public class fibonacci {
	public static void main(String[] args) {
	Solution9 s = new Solution9();
	System.out.println("결과 : " + s.solution(5));
	}
}
class Solution9{
	int[] dp = new int[100];
	public int solution(int n) {

		if(n==1)
			return 1;
		if(n==2)
			return 1;
		if(dp[n] != 0)
			return dp[n];
		
		return dp[n] = solution(n-1) + solution(n-2);
	}
}