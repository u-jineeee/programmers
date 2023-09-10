package ll.level1.p12903;

public class Main {
}

class Solution {
	public String solution(String s) {
		int len = s.length();
		String[] str = s.split("");
		if (len % 2 == 1)
			return str[(len-1) / 2];
		return str[(len/2) - 1] + str[len/2];
	}
}