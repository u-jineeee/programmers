package ll.level0.p120956;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] baby = {"aya", "ye", "woo", "ma"};
		List<String> older = new ArrayList<>();

		for(String s : babbling) {
			for(String b : baby) {
				s = s.replace(b, " ");
			}
			older.add(s);
		}

		for(String s : older) {
			s = s.replace(" ", "");
			if(s.isEmpty())
				answer++;
		}
		return answer;
	}
}
