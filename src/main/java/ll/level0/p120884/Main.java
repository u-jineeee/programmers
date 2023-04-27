package ll.level0.p120884;

public class Main {
}

class Solution {
    public int solution(int chicken) {
        int answer = chicken / 10;
        int coupon = chicken / 10 + chicken % 10;

        while(coupon >= 10) {
            answer += coupon / 10;
            coupon = coupon / 10 + coupon % 10;
        }

        return answer;
    }
}