package ll.level0.p120924;

public class Main {
}

class Solution {
    public int solution(int[] common) {
        if( common[1] - common[0] == common[2] - common[1])
            return common[common.length - 1] + common[1] - common[0];

        return common[common.length - 1] * (common[1] / common[0]);
    }
}
