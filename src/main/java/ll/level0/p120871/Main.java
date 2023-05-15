package ll.level0.p120871;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;

            while(isThree(answer) || answer % 3 == 0) {
                if (isThree(answer))
                    answer++;
                if (answer % 3 == 0)
                    answer++;
            }
        }

        return answer;
    }

    public boolean isThree(int n) {
        while (n != 0) {
            if (n % 10 == 3)
                return true;
            n /= 10;
        }
        return false;
    }
}