/*
1번
문제 설명
Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 빨간색으로 칠해져 있고 모서리는 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

Leo는 집으로 돌아와서 아까 본 카펫의 빨간색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 빨간색 격자의 수 red가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 
배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
빨간색 격자의 수 red는 1 이상 2,000,000 이하인 자연수입니다.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

입출력 예
brown	red		return
10		2		[4, 3]
8		1		[3, 3]
24		24		[8, 6]

 */
public class carpet {
	public static void main(String[] args) {
		Solution11 s = new Solution11();
		int a = 10;
		int b = 2;
		
		System.out.println(s.solution(a,b));
	}
}

class Solution11{
	public int[] solution(int a, int b) {
		int[] answer = new int[2];
		int count = 0;
		int sum = a + b;
		int[] arr = new int[sum/2];
		
		//제곱
		if(sum==Math.sqrt(sum) * Math.sqrt(sum)) {
			for(int i=0; i<2; i++) {
				answer[i]=(int)Math.sqrt(sum);
				System.out.println(answer[i]);
			}
			return answer;
		}
		else {
			for(int i=2; i<=sum/2; i++) {
				if(sum%i==0) {
					arr[count]=i;
					count++;
				}
			}
			//배열의 중간값
			if(count%2==0) {
				answer[0] = arr[count/2];
				answer[1] = sum/answer[0];
			}
			//확인출력
			for(int i=0; i<2; i++) {
				System.out.println(answer[i]);
			}
		}
		
		return answer;
	}
}
