package ll.level1.p135808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
	public int solution(int k, int m, int[] score) {
		Arrays.sort(score);
		List<Integer> list = new ArrayList<>();
		int answer = 0;

		for (int x : score) {
			list.add(x);
		}
		Collections.reverse(list);
		score = list.stream().mapToInt(Integer::intValue).toArray();

		for (int i = m - 1; i < score.length; i+=m) {
			answer += score[i] * m;
		}
		return answer;
	}
}
