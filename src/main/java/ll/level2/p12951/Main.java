package ll.level2.p12951;

public class Main {
}

class Solution {
	public String solution(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i == 0 || s.charAt(i-1) == ' ') {
				sb.append(String.valueOf(ch).toUpperCase());
			}
			else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
