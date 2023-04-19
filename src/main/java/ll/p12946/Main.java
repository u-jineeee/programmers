package ll.p12946;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    static List<Integer> arrayList = new ArrayList<>();
    public static void hanoi(int n, int x, int y, int z) {
        if( n == 1) {
            arrayList.add(x);
            arrayList.add(z);
        }
        else {
            hanoi(n - 1, x, z, y);
            arrayList.add(x);
            arrayList.add(z);
            hanoi(n - 1, y, x, z);
        }
    }
    public static int[][] solution(int n) {
        hanoi(n, 1, 2, 3);

        int[][] answer = new int[arrayList.size()/2][2];
        for(int i = 0; i < arrayList.size(); i+=2) {
            answer[i / 2][0] = arrayList.get(i);
            answer[i / 2][1] = arrayList.get(i+1);
        }
        return answer;
    }
}
