import java.util.Arrays;

/*
문제 설명
길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.

제한사항
배열의 길이는 10만 이하입니다.
배열의 원소는 0 이상 10만 이하인 정수입니다.
입출력 예
arr				result
[4, 1, 3, 2]	true
[4, 1, 3]		false
 */
public class permutation {
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int[] arr= {4,1,3,2};
		System.out.println(s.solution(arr));
	}

}
class Solution6{
	public boolean solution(int[] arr){
		 Arrays.sort(arr);
	        for(int i=0; i<arr.length; i++){
	            if(i+1==arr[i])
	                continue;
	            return false;
	        }
	        return true;
	}
	
}
