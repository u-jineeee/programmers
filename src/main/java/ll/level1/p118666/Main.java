package ll.level1.p118666;

import java.util.HashMap;
import java.util.Map;

public class Main {
}

class Solution {
	public String solution(String[] survey, int[] choices) {
		Map<Character, Integer> map = new HashMap<>(Map.of('R', 0, 'T', 0, 'C', 0, 'F', 0,
			'J', 0, 'M', 0, 'A', 0, 'N', 0));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < survey.length; i++) {
			int choice = choices[i];
			if (choice == 0) continue;
			else if (choice < 4) {
				int sum = map.get(survey[i].charAt(0)) + score(choice);
				map.put(survey[i].charAt(0), sum);
			}
			else {
				int sum = map.get(survey[i].charAt(1)) + score(choice);
				map.put(survey[i].charAt(1), sum);
			}
		}

		sb.append(map.get('R') >= map.get('T') ? "R" : "T");
		sb.append(map.get('C') >= map.get('F') ? "C" : "F");
		sb.append(map.get('J') >= map.get('M') ? "J" : "M");
		sb.append(map.get('A') >= map.get('N') ? "A" : "N");

		return sb.toString();
	}
	public int score(int choice) {
		return switch(choice) {
			case 1, 7 -> 3;
			case 2, 6 -> 2;
			case 3, 5 -> 1;
			default -> 0;
		};
	}
}