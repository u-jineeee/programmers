package ll.level2.p43165;

public class Main {
}

class Solution {
    int answer = 0;
    int[] numbers;
    int target;

    public int solution(int[] _numbers, int _target) {
        this.numbers = _numbers;
        this.target = _target;
        dfs(0, 0);
        return answer;
    }

    public void dfs(int depth, int sum) {
        if (depth == numbers.length) {
            if (target == sum)
                answer++;
        }
        else {
            dfs(depth + 1, sum + numbers[depth]);
            dfs(depth + 1, sum - numbers[depth]);
        }
    }
}