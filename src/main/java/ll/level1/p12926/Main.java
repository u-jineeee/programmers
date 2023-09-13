package ll.level1.p12926;

public class Main {
}

class Solution {
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				sb.append(' ');
			}
			else if (c >= 'A' && c <= 'Z') {
				if (c + n > 'Z') {
					sb.append((char)((c + n) - 26));
				}
				else {
					sb.append((char)(c + n));
				}
			}
			else {
				if (c + n > 'z') {
					sb.append((char)((c + n) - 26));
				}
				else {
					sb.append((char)(c + n));
				}
			}
		}
		return sb.toString();
	}
}