package ll.level1.p17682;

public class Main {
}

class Solution {
	public int solution(String dartResult) {
		int[] score = new int[3];
		int cnt = 0;
		int answer = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);
			if (c == '1' && dartResult.charAt(i+1) == '0') {
				score[cnt] = 10;
				i++;
			}
			else if (c >= '0' && c <= '9') {
				score[cnt] = Character.getNumericValue(c);
			}
			else if (c == '*') {
				if (cnt != 1) {
					score[cnt-2] = score[cnt-2] * 2;
				}
				score[cnt-1] = score[cnt-1] * 2;
			}
			else if (c == '#') {
				score[cnt-1] = -score[cnt-1];
			}
			else {
				score[cnt] = bonus(score[cnt], c);
				cnt++;
			}
		}

		for (int x : score) {
			answer += x;
		}
		return answer;
	}
	public int bonus(int n, char c) {
		return switch (c) {
			case 'D' -> n * n;
			case 'T' -> n * n * n;
			default -> n;
		};
	}
}
