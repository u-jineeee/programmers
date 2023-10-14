package ll.level2.p42578;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
	public int solution(String[][] clothes) {
		Map<String, Integer> map = new HashMap<>();
		int answer = 1;

		for (String[] s : clothes) {
			int cnt = 0;
			if (!map.isEmpty() && map.containsKey(s[1])) {
				cnt = map.get(s[1]);
			}
			map.put(s[1], ++cnt);
		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			answer *= m.getValue() + 1;
		}

		return answer - 1;
	}
}
