package ll.level2.p12939;

public class Main {
}

class Solution {
	public String solution(String s) {
		String[] str = s.split(" ");
		int[] number = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			number[i] = Integer.parseInt(str[i]);
		}

		int max = number[0];
		int min = number[0];
		for (int n : number) {
			if (max < n) max = n;
			if (min > n) min = n;
		}

		return "" + min + " " + max;
	}
}
