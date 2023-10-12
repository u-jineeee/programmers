package ll.level2.p42747;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int solution(int[] citations) {
		int answer = 0;
		boolean flag = false;
		Arrays.sort(citations);

		for (int i = citations.length-1; i >= 0; i--) {
			int n = citations[i];
			if (n <= citations.length-i) {
				answer = n;
				break;
			}
			else {
				if (i != 0 && citations[i-1] < --n) {
					while (citations[i-1] < n) {
						if (n <= citations.length-i) {
							answer = n;
							flag = true;
							break;
						}
						n--;
					}
				} else if (i == 0) {
					answer = citations.length;
				}
			}
			if (flag) break;
		}
		return answer;
	}
}
