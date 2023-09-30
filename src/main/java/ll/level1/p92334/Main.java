package ll.level1.p92334;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
}

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		Map<String, Set<String>> map = new HashMap<>();
		for (String id : id_list) {
			Set<String> set = new HashSet<>();
			map.put(id, set);
		}

		for (String r : report) {
			String[] split = r.split(" ");
			Set<String> set = map.get(split[0]);
			set.add(split[1]);
		}

		Map<String, Integer> report_id = new HashMap<>();
		for (String id : id_list) {
			int cnt = 0;
			for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
				Set<String> value = entry.getValue();

				if (value.contains(id)) {
					cnt++;
				}
			}
			report_id.put(id, cnt);
		}

		List<String> black_id = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : report_id.entrySet()) {
			if (entry.getValue() >= k) {
				black_id.add(entry.getKey());
			}
		}

		int[] answer = new int[id_list.length];
		int i = 0;
		for (String id : id_list){
			int cnt = 0;
			Set<String> set = map.get(id);
			for (String black : black_id) {
				if (set.contains(black))
					cnt++;
			}
			answer[i] = cnt;
			i++;
		}
		return answer;
	}
}
