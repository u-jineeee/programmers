package ll.level1.p155652;

public class Main {
}

class Solution {
	public String solution(String s, String skip, int index) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int cnt = 0;
			for (int j = 1; j <= index+cnt; j++) {
				for (int k = 0; k < skip.length(); k++) {
					char next = (char)('a' + (s.charAt(i)-'a'+j) % 26);
					if (next == skip.charAt(k)) {
						cnt++;
					}
				}
			}
			sb.append((char)('a' + ((c-'a'+cnt+index) % 26)));
		}

		return sb.toString();
	}
}
