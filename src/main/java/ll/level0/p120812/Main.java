package ll.level0.p120812;

public class Main {
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < array.length; i++) {
            int cnt = 0;
            for(int j = 0; j <= i; j++) {
                if(array[i] == array[j])
                    cnt++;
            }

            if(max < cnt) {
                answer = array[i];
                max = cnt;
            }
            else if(max == cnt) {
                answer = -1;
            }
        }
        return answer;
    }
}
