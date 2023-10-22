package ll.level2.p42626;

import java.util.PriorityQueue;

public class Main {
}

class Solution {
	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		int answer = 0;
		for (int n : scoville) {
			heap.offer(n);
		}
		int min = heap.peek();
		while (min < K && heap.size() > 1) {
			int x = heap.poll();
			int y = heap.poll();
			heap.offer(x + y*2);
			min = heap.peek();
			answer++;
		}

		if (min < K)
			return -1;

		return answer;
	}
}