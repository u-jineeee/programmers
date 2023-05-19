package ll.level0.p120808;

public class Main {
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int x = numer1 * denom2 + numer2 * denom1;
        int y = denom1 * denom2;
        int gcd = GCD(x, y);
        x /= gcd;
        y /= gcd;

        int[] answer = {x, y};

        return answer;
    }

    int GCD(int x, int y) {
        while(y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}