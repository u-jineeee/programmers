package ll.level1.p12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
		for (int x : arr) {
			if (x % divisor == 0)
				list.add(x);
		}
		Collections.sort(list);
		if (list.isEmpty())
			return new int[] {-1};

		return list.stream().mapToInt(i -> i).toArray();
	}
}