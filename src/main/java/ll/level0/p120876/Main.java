package ll.level0.p120876;

public class Main {
}

class Solution {
	public int solution(int[][] lines) {
		int answer = 0;
		int[] arr = new int[200];

		for (int[] line : lines) {
			for (int j = line[0] + 100; j < line[1] + 100; j++) {
				arr[j]++;
			}
		}

		for(int i = 0; i < 200; i++) {
			if(arr[i] > 1)
				answer++;
		}

		return answer;
	}
}
