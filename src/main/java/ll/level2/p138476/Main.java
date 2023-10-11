package ll.level2.p138476;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
}

class Solution {
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		int cnt = 0;
		int number = 0;
		int sum = 0;
		List<Integer> list = new ArrayList<>();

		Arrays.sort(tangerine);
		for (int i = tangerine.length-1; i >= 0; i--) {
			if (number != tangerine[i]) {
				list.add(cnt);
				number = tangerine[i];
				cnt = 0;
			}
			cnt++;
		}
		list.add(cnt);
		list.sort(Comparator.reverseOrder());

		for (int n : list) {
			if (sum >= k)
				break;
			sum += n;
			answer++;
		}
		return answer;
	}
}
