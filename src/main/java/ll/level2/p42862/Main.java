package ll.level2.p42862;

public class Main {
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n];
        int answer = n;
        for(int i = 0; i < lost.length; i++) {
            clothes[lost[i] - 1] = -1;
        }

        for(int i = 0; i < reserve.length; i++) {
            clothes[reserve[i] - 1]++;
        }

        for(int i = 0; i < n; i++) {
            if(clothes[i] == -1) {
                if (i - 1 >= 0 && clothes[i - 1] == 1) {
                    clothes[i]++;
                    clothes[i-1]--;
                } else if (i + 1 < n && clothes[i + 1] == 1) {
                   clothes[i]++;
                   clothes[i+1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}