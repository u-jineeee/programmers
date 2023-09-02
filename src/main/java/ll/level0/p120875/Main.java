package ll.level0.p120875;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int solution(int[][] dots) {
		if(r(dots[0][0], dots[0][1], dots[1][0], dots[1][1]) == r(dots[2][0], dots[2][1], dots[3][0], dots[3][1]))
			return 1;
		if(r(dots[0][0], dots[0][1], dots[2][0], dots[2][1]) == r(dots[1][0], dots[1][1], dots[3][0], dots[3][1]))
			return 1;
		if(r(dots[0][0], dots[0][1], dots[3][0], dots[3][1]) == r(dots[1][0], dots[1][1], dots[2][0], dots[2][1]))
			return 1;
		return 0;
	}
	public double r(int x1, int y1, int x2, int y2) {
		return (double)(y2 - y1) / (x2 - x1);
	}
}