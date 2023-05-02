package ll.level2.p12945;

public class Main {
}

class Solution {
    public int solution(int n) {
        int[] p = new int[n + 1];
        p[0] = 0;
        p[1] = 1;
        for(int i = 2; i <= n; i++) {
            p[i] = (p[i - 2] + p[i - 1]) % 1234567;
        }
        return p[n];
    }
}