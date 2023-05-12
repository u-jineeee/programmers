package ll.level2.p64065;

import java.util.*;

public class Main {
}

class Solution {
    public int[] solution(String s) {

        s = s.substring(2, s.length() - 2);
        String[] str = s.split("},\\{");

        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str.length - 1; j++) {
                if(str[j].length() > str[j+1].length()) {
                    String tmp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = tmp;
                }
            }
        }
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < str.length; i++) {
            String[] str2 = str[i].split(",");
            for(int j = 0; j < str2.length; j++) {
                int x = Integer.parseInt(str2[j]);
                if(!list.contains(x))
                    list.add(x);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}