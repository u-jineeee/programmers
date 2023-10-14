package ll.level2.p17680;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public int solution(int cacheSize, String[] cities) {
		List<String> list = new ArrayList<>();
		int runningTime = 0;

		if (cacheSize == 0)
			return cities.length * 5;

		for (String city : cities) {
			city = city.toLowerCase();
			if (list.isEmpty()) {
				runningTime += 5;
			} else if (list.contains(city)) {
				list.remove(city);
				runningTime++;
			} else if (list.size() == cacheSize) {
				list.remove(0);
				runningTime += 5;
			} else {
				runningTime += 5;
			}
			list.add(city);
		}
		return runningTime;
	}
}
