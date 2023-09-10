package ll.level1.p68935;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public int solution(int n) {
		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			int r = n % 3;
			list.add(r);
			n /= 3;
		}

		int[] arr = list.stream().mapToInt(i -> i).toArray();
		int answer = 0;
		int three = 1;
		for (int i = arr.length-1; i >= 0; i--) {
			if (i != arr.length-1) three *= 3;
			answer += arr[i] * three;
		}
		return answer;
	}
}