package ll.level2.p92341;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
	public int[] solution(int[] fees, String[] records) {
		List<Integer> answer = new ArrayList<>();

		Arrays.sort(records, Comparator.comparing(Solution::getValueFromRecord));

		String car_number = "";
		int time = 0;
		int before = 0;
		int after = 0;
		boolean flag = false;
		for (String record : records) {
			String[] parts = record.split(" ");

			if (parts[2].equals("IN")) {
				if (!car_number.isEmpty() && !car_number.equals(parts[1])) {
					if (flag) {
						time += 1439 - before;
					}
					answer.add(total_fee(time, fees));
					time = 0;
				}
				car_number = parts[1];
				before = minutes(parts[0]);
				flag = true;
			} else {
				after = minutes(parts[0]);
				time += after - before;
				flag = false;
			}
		}
		if (flag) {
			time += 1439 - before;
			answer.add(total_fee(time, fees));
		} else if (time != 0) {
			answer.add(total_fee(time, fees));
		}
		return answer.stream().mapToInt(i->i).toArray();
	}
	private static String getValueFromRecord(String record) {
		String[] parts = record.split(" ");
		return parts[1];
	}
	private static int total_fee(double time, int[] fees) {
		if (time <= fees[0])
			return fees[1];
		return fees[1] + (int)Math.ceil((time - fees[0])/fees[2]) * fees[3];
	}
	private static int minutes(String time) {
		return Integer.parseInt(time.charAt(0) + "" + time.charAt(1)) * 60 +
			Integer.parseInt(time.charAt(3) + "" + time.charAt(4));
	}
}
