package ll.level2.p17677;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public int solution(String str1, String str2) {
		int answer = 0;
		int intersection = 0;
		double union = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		List<String> list1 = breakTwoLetter(str1);
		List<String> list2 = breakTwoLetter(str2);

		for (String s : list1) {
			if (list2.contains(s)) {
				intersection++;
				list2.remove(s);
			}
		}
		union = list1.size() + list2.size();
		answer = (int)((intersection / union) * 65536);
		if (intersection == 0 && union == 0)
			return 65536;
		return answer;
	}

	private List<String> breakTwoLetter(String str) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length()-1; i++) {
			char x = str.charAt(i);
			char y = str.charAt(i+1);
			if (!((x >= 'a' && x <= 'z') &&
				(y >= 'a' && y <= 'z')))
				continue;
			list.add(x+""+y);
		}
		return list;
	}
}
