package ll.level1.p133499;

public class Main {
}

class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		for (String s : babbling) {
			s = s.replace("aya", "1");
			s = s.replace("ye", "2");
			s = s.replace("woo", "3");
			s = s.replace("ma", "4");
			if (isNumeric(s)) {
				if (s.length() == 1) {
					answer++;
					continue;
				}
				int flag = 0;
				for(int i = 0; i < s.length()-1; i++) {
					if (s.charAt(i) == s.charAt(i+1)) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) answer++;
			}
		}
		return answer;
	}
	public boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) return false;
		}
		return true;
	}
}
