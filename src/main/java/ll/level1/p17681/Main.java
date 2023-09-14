package ll.level1.p17681;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> map = new ArrayList<>();

		for (int x : arr1) {
			list1.add(adjustSize(n, x));
		}
		for (int y : arr2) {
			list2.add(adjustSize(n, y));
		}

		for (int i = 0; i < list1.size(); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < list1.get(i).length(); j++) {
				char a = list1.get(i).charAt(j);
				char b = list2.get(i).charAt(j);
				if (a == '1' || b == '1') {
					sb.append("#");
				}
				else {
					sb.append(" ");
				}
			}
			map.add(sb.toString());
		}

		return map.toArray(new String[0]);
	}

	public String adjustSize(int n, int x) {
		String s = Integer.toBinaryString(x);
		int size = s.length();
		StringBuilder zero = new StringBuilder();
		while (size < n) {
			zero.append("0");
			size++;
		}
		return zero + s;
	}
}
