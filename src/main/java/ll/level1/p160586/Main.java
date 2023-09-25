package ll.level1.p160586;

public class Main {
}

class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		int[] alphabet = new int[26];
		int[] answer = new int[targets.length];

		for (String s : keymap) {
			for (int j = 0; j < s.length(); j++) {
				int idx = s.charAt(j) - 'A';
				if (alphabet[idx] == 0 || alphabet[idx] != 0 && alphabet[idx] > j) {
					alphabet[idx] = j+1;
				}
			}
		}

		for (int i = 0; i < targets.length; i++) {
			for (int j = 0; j < targets[i].length(); j++) {
				if (alphabet[targets[i].charAt(j)-'A'] == 0) {
					answer[i] = -1;
					break;
				}
				answer[i] += alphabet[targets[i].charAt(j)-'A'];
			}
		}
		return answer;
	}
}
