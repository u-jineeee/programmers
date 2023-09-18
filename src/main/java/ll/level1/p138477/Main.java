package ll.level1.p138477;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			int[] arr = new int[i+1];
			System.arraycopy(score, 0, arr, 0, i+1);
			Arrays.sort(arr);
			if (i < k) {
				answer[i] = arr[0];
			}
			else {
				answer[i] = arr[arr.length - k];
			}
		}
		return answer;
	}
}
