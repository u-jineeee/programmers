package ll.level2.p17684;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public int[] solution(String msg) {
		List<Integer> answer = new ArrayList<>();
		List<String> dictionary = new ArrayList<>();
		int cnt;
		for (int i = 0; i < 26; i++) {
			dictionary.add(String.valueOf((char)('A' + i)));
		}
		for (int i = 0; i < msg.length();) {
			String str = "";
			String before = "";
			boolean flag = false;
			for (int j = i; j < msg.length(); j++) {
				str += msg.charAt(j);
				if (i == msg.length() - 1) {
					answer.add(dictionary.indexOf(str) + 1);
					flag = false;
					i++;
				} else if (!dictionary.contains(str)) {
					answer.add(dictionary.indexOf(before) + 1);
					dictionary.add(str);
					flag = false;
					i = j;
					break;
				} else {
					before = str;
					flag = true;
				}
			}
			if (flag && dictionary.contains(str)) {
				answer.add(dictionary.indexOf(str) + 1);
				break;
			}
		}
		return answer.stream().mapToInt(i->i).toArray();
	}
}
