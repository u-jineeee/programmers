package ll.level0.p120882;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[][] score) {
        List<Double> avgScore = new ArrayList<>();
        for (int[] ints : score) {
            double avg = (ints[0] + ints[1]) / 2.0;
            avgScore.add(avg);
        }

        List<Double> sortScore = new ArrayList<>(avgScore);
        sortScore.sort(Collections.reverseOrder());

        int[] answer = new int[avgScore.size()];
        for(int i = 0; i < avgScore.size(); i++) {
            answer[i] = sortScore.indexOf(avgScore.get(i)) + 1;
        }
        return answer;
    }
}

