package ll.level2.p12953;

import java.util.HashMap;
import java.util.Map;

public class Main {
}

class Solution {
	public int solution(int[] arr) {
		int answer = 1;
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : arr) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				int cnt = 0;
				while(n % i == 0){
					n /= i;
					cnt++;
				}
				if (!map.containsKey(i) || map.get(i) < cnt){
					map.put(i, cnt);
				}
			}
			if (n != 1) {
				if (!map.containsKey(n) || map.get(n) < 1){
					map.put(n, 1);
				}
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			for (int i = 1; i <= entry.getValue(); i++)
				answer *= entry.getKey();
		}
		return answer;
	}
}
