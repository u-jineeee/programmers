package ll.level0.p120868;

public class Main {
    public static void main(String args[]){
    }
}

class Solution {
    public static int solution(int[] sides) {
        int answer = 0;

        int x = Math.max(sides[0], sides[1]);
        int y = Math.min(sides[0], sides[1]);

        int z = x - y + 1;
        while (z < x) {
            answer++;
            z += 1;
        }

        if(x + y > x) {
            int v = x;
            while(v < x + y) {
                answer++;
                v += 1;
            }
        }

        return answer;
    }
}