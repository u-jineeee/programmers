package ll.level2.p84512;

public class Main {
}

class Solution {
	public static int[] arr = {781, 156, 31, 6, 1};
	public int solution(String word) {
		int answer = word.length();

		for (int i = 0; i < word.length(); i++) {
			answer += arr[i] * "AEIOU".indexOf(word.charAt(i));
		}
		return answer;
	}
}
