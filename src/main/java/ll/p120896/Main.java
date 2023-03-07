package ll.p120896;

import java.util.Arrays;

public class Main {
}

class Solution{
    public String solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            boolean flag = true;
            for(int j = 0; j < s.length(); j++) {
                if(i == j)
                    continue;
                else if (s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag)
                answer += s.charAt(i);
        }
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
