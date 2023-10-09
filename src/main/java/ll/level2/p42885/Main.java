package ll.level2.p42885;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int solution(int[] people, int limit) {
		Arrays.sort(people);
		int answer = 0;
		int last = 0;

		for (int i = people.length-1; i >= 0; i--) {
			if (i < last) break;
			if (people[i] + people[last] <= limit) {
				last++;
			}
			answer++;
		}
		return answer;
	}
}
