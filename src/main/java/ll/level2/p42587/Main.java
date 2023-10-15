package ll.level2.p42587;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Main {
}

class Solution {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for (int n : priorities) {
			list.add(n);
		}
		while (location >= 0) {
			int max = Collections.max(list);
			if (list.get(0) >= max) {
				list.remove(0);
				location--;
				answer++;
				if (location < 0) break;
			} else {
				int n = list.remove(0);
				list.add(n);
				location--;
				if (location < 0) location = list.size()-1;
			}
		}
		return answer;
	}
}
