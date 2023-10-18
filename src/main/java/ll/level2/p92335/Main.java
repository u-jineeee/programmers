package ll.level2.p92335;

public class Main {
}

class Solution {
	public int solution(int n, int k) {
		int answer = 0;
		StringBuilder str = new StringBuilder();
		while (n > 0) {
			str.append(n % k);
			n /= k;
		}
		str = str.reverse();
		String[] arr = str.toString().split("0");

		for (String s : arr) {
			if (s.equals("")) continue;
			long number = Long.parseLong(s);
			if (isPrime(number))
				answer++;
		}

		return answer;
	}
	private boolean isPrime(long x) {
		if (x < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
