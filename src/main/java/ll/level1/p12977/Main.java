package ll.level1.p12977;

public class Main {
}

class Solution {
	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i + 1; j < nums.length-1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int x = nums[i] + nums[j] + nums[k];
					if (isPrime(x))
						answer++;
				}
			}
		}
		return answer;
	}

	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
