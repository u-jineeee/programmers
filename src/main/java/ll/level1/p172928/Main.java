package ll.level1.p172928;

public class Main {
}

class Solution {
	public int[] solution(String[] park, String[] routes) {
		int current_X = 0;
		int current_Y = 0;

		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				if (park[i].charAt(j) == 'S') {
					current_X = j;
					current_Y = i;
				}
			}
		}

		for (String route : routes) {
			String[] op = route.split(" ");
			int n = Integer.parseInt(op[1]);
			boolean flag = true;

			if (op[0].equals("E") && current_X+n > park[0].length()-1) continue;
			else if (op[0].equals("W") && current_X-n < 0) continue;
			else if (op[0].equals("S") && current_Y+n > park.length-1) continue;
			else if (op[0].equals("N") && current_Y-n < 0) continue;

			switch (op[0]) {
				case "E":
					for (int i = current_X + 1; i <= current_X + n; i++) {
						if (park[current_Y].charAt(i) == 'X') {
							flag = false;
							break;
						}
					}
					break;
				case "W":
					for (int i = current_X - 1; i >= current_X - n; i--) {
						if (park[current_Y].charAt(i) == 'X') {
							flag = false;
							break;
						}
					}
					break;
				case "S":
					for (int i = current_Y + 1; i <= current_Y + n; i++) {
						if (park[i].charAt(current_X) == 'X') {
							flag = false;
							break;
						}
					}
					break;
				case "N":
					for (int i = current_Y - 1; i >= current_Y - n; i--) {
						if (park[i].charAt(current_X) == 'X') {
							flag = false;
							break;
						}
					}
					break;
			}
			if (flag) {
				switch (op[0]) {
					case "E" -> current_X += n;
					case "W" -> current_X -= n;
					case "S" -> current_Y += n;
					default -> current_Y -= n;
				}
			}
		}

		return new int[]{current_Y, current_X};
	}
}
