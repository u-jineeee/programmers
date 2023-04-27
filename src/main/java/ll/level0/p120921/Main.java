package ll.level0.p120921;

public class Main {
}

class Solution {
    public int solution(String A, String B) {
        int size = A.length();

        if(A.equals(B))
            return 0;

        for(int i = 0; i < size; i++) {
            A = A.charAt(size - 1) + A.substring(0, size - 1);

            if(A.equals(B))
                return i + 1;
        }
        return -1;
    }
}
