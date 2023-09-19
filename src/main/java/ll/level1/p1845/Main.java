package ll.level1.p1845;

import java.util.HashSet;
import java.util.Set;

public class Main {
}

class Solution {
	public int solution(int[] nums) {
		int num = nums.length / 2;
		Set<Integer> set = new HashSet<>();

		for (int x : nums) {
			set.add(x);
		}

		if (num < set.size()) {
			return num;
		}

		return set.size();
	}
}
