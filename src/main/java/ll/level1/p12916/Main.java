package ll.level1.p12916;

public class Main {
}

class Solution {
	boolean solution(String s) {
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'p' || c == 'P')
				n++;
			else if (c == 'y' || c == 'Y')
				n--;
		}
		return n == 0;
	}
}