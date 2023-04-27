package ll.level0.p120860;

public class Main {
}

class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int y1 = dots[0][1];
        int y2 = dots[1][1];

        for(int i = 2; i < dots.length; i++) {
            if(x1 == x2)
                x2 = dots[i][0];
            if(y1 == y2)
                y2 = dots[i][1];
        }
        int x = Math.max(x1, x2) - Math.min(x1, x2);
        int y = Math.max(y1, y2) - Math.min(y1, y2);
        return x * y;
    }
}