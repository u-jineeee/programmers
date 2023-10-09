package ll.level2.p12981;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public int[] solution(int n, String[] words) {
		List<String> list = new ArrayList<>();
		char last = 0;
		char first;

		for (int i = 0; i < words.length; i++) {
			if (i != 0) {
				first = words[i].charAt(0);
				if (first != last || list.contains(words[i])) {
					return new int[]{i%n+1, i/n+1};
				}
			}
			list.add(words[i]);
			last = words[i].charAt(words[i].length() - 1);
		}

		return new int[]{0, 0};
	}
}
