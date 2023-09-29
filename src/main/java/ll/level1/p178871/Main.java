package ll.level1.p178871;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}

		for (String calling : callings) {
			int idx = map.get(calling);
			String beforePlayer = players[idx-1];

			players[idx-1] = calling;
			players[idx] = beforePlayer;

			map.put(calling, idx-1);
			map.put(beforePlayer,idx);
		}

		return players;
	}
}
