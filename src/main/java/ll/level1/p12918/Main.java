package ll.level1.p12918;

public class Main {
}

class Solution {
	public boolean solution(String s) {
		try {
			Integer.parseInt(s);
			return s.length() == 4 || s.length() == 6;
		} catch (Exception e) {
			return false;
		}
	}
}