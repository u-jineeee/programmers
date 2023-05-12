package ll.level0.p120878;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        int gcd = x.gcd(y).intValue();
        int z = y.intValue() / gcd;

        while(z % 2 == 0)
            z /= 2;

        while(z % 5 == 0)
            z /= 5;

        if(z > 2)
            answer = 2;

        return answer;
    }
}