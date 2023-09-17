package ll.level1.p42748;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int size = commands.length;
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			int length = commands[i][1] - commands[i][0] + 1;
			int[] subArray = new int[length];
			System.arraycopy(array, commands[i][0] - 1,subArray, 0, length);
			Arrays.sort(subArray);
			answer[i] = subArray[commands[i][2] - 1];
		}
		return answer;
	}
}
