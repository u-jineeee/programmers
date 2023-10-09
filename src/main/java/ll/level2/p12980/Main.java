package ll.level2.p12980;

import java.util.*;

public class Main {
}

class Solution {
	public int solution(int n) {
		int ans = 0;

		while (n > 0) {
			if (n % 2 == 0) {
				n /= 2;
			}
			else {
				--n;
				ans++;
			}
		}

		return ans;
	}
}
