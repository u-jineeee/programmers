package ll.level1.p42840;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[] answers) {
        int[] giveUpMath1 = new int[]{1, 2, 3, 4, 5};
        int[] giveUpMath2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] giveUpMath3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] right = new int[3];

        for(int i = 0; i < answers.length; i++) {
            int x = answers[i];

            if(giveUpMath1[i % giveUpMath1.length] == x) right[0]++;
            if(giveUpMath2[i % giveUpMath2.length] == x) right[1]++;
            if(giveUpMath3[i % giveUpMath3.length] == x) right[2]++;
        }
        int max = Math.max(right[0], (Math.max(right[1], right[2])));

        List<Integer> highScore = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            if(right[i] == max)
                highScore.add(i + 1);
        }
        return highScore.stream().mapToInt(Integer::intValue).toArray();
    }
}
