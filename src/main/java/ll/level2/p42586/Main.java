package ll.level2.p42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            queue.offer((int) Math.ceil((100.0 - progresses[i])/speeds[i]));
        }

        while(!queue.isEmpty()) {
            int cnt = 1;
            int day = queue.poll();

            while(!queue.isEmpty() && day >= queue.peek()) {
                cnt++;
                queue.poll();
            }
            answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}