package ll.level0.p120909;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 2;
        int s = (int)Math.sqrt(n);
        if(s * s == n)
            answer = 1;
        return answer;
    }
}