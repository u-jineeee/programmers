package ll.level1.p68644;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
}

class Solution {
	public int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);

		return answer;
	}
}
