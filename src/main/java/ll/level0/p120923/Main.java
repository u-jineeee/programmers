package ll.level0.p120923;

public class Main {
}

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for(int i = -total; i <= total; i++) {
            int sum = 0;
            for(int j = 0; j < num; j++) {
                sum += i + j;
            }
            if(sum == total) {
                for(int j = 0; j < num; j++)
                    answer[j] = i + j;
            }
        }

        if(total == 0) {
            int idx = 0;
            for(int i = -(num / 2); i <= (num / 2); i++) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}