package ll.level1.p81301;

public class Main {
}

class Solution {
	public int solution(String s) {
		int answer = 0;

		for (int i = 0; i < s.length();) {
			if (s.charAt(i) == 'z') {
				answer = answer*10;
				i += 4;
			}
			else if (s.charAt(i) == 'o') {
				answer = answer*10 + 1;
				i += 3;
			}
			else if (s.charAt(i) == 't') {
				if (s.charAt(i+1) == 'w') {
					answer = answer * 10 + 2;
					i += 3;
				}
				else {
					answer = answer*10 + 3;
					i += 5;
				}
			}
			else if (s.charAt(i) == 'f') {
				if (s.charAt(i+1) == 'o') {
					answer = answer*10 + 4;
				}
				else {
					answer = answer*10 + 5;
				}
				i += 4;
			}
			else if (s.charAt(i) == 's') {
				if (s.charAt(i+1) == 'i') {
					answer = answer * 10 + 6;
					i += 3;
				}
				else {
					answer = answer * 10 + 7;
					i += 5;
				}
			}
			else if (s.charAt(i) == 'e') {
				answer = answer*10 + 8;
				i += 5;
			}
			else if (s.charAt(i) == 'n') {
				answer = answer*10 + 9;
				i += 4;
			}
			else {
				answer = answer*10 + Integer.parseInt(String.valueOf(s.charAt(i)));
				i++;
			}
		}
		return answer;
	}
}
