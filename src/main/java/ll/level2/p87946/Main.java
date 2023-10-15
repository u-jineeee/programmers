package ll.level2.p87946;

public class Main {
}

class Solution {
	static boolean[] visited;
	static int count = 0;

	public int solution(int k, int[][] dungeons) {
		visited = new boolean[dungeons.length];
		dfs(0, k, dungeons);
		return count;
	}
	private void dfs(int depth, int strength, int[][] dungeons) {
		count = Math.max(count, depth);
		for (int i = 0; i < dungeons.length; i++) {
			if (visited[i] || dungeons[i][0] > strength)
				continue;
			visited[i] = true;
			dfs(depth + 1, strength - dungeons[i][1], dungeons);
			visited[i] = false;
		}
	}
}
