package ll.level1.p150370;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();

		today = today.replace(".", "");
		for (String term : terms) {
			String[] s = term.split(" ");
			map.put(s[0], Integer.parseInt(s[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String type = String.valueOf(privacies[i].charAt(11));
			int year = Integer.parseInt(privacies[i].substring(0,4));
			int month = Integer.parseInt(privacies[i].substring(5,7));
			int day = Integer.parseInt(privacies[i].substring(8,10));

			int term = map.get(type);
			year += term / 12;
			month += term % 12;

			if (month > 12) {
				year += month / 12;
				month = month % 12;
			}
			String date = year + "";
			if (month < 10)
				date += "0" + month;
			else
				date += month;

			if (day < 10)
				date += "0" + day;
			else
				date += day;

			if (today.compareTo(date) >= 0)
				answer.add(i+1);
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}
