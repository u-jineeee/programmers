package ll.level1.p86051;

public class Main {
}

class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		int[] arr = new int[10];
		for (int number : numbers) {
			arr[number] = 1;
		}

		for (int i = 0; i < 10; i++) {
			if (arr[i] == 0)
				answer += i;
		}

		return answer;
	}
}
