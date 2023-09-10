package ll.level1.p12930;

public class Main {
}

class Solution {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		String[] str = s.split("");
		int i = 0;
		for (String x : str) {
			if (x.equals(" ")) {
				sb.append(" ");
				i = -1;
			}
			else if (i % 2 == 1) {
				if (x.charAt(0) > 'Z')
					sb.append(x.charAt(0));
				else
					sb.append((char)(x.charAt(0) + 32));
			}
			else {
				if (x.charAt(0) > 'Z')
					sb.append((char)(x.charAt(0) - 32));
				else
					sb.append(x.charAt(0));
			}
			i++;
		}
		return sb.toString();
	}
}