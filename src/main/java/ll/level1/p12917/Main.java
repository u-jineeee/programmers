package ll.level1.p12917;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
	public String solution(String s) {
		List<String> list = new ArrayList<>(List.of(s.split("")));
		list.sort(Collections.reverseOrder());

		StringBuilder sb = new StringBuilder();
		for (String x : list) {
			sb.append(x);
		}
		return sb.toString();
	}
}
