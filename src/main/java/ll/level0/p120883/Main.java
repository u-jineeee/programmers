package ll.level0.p120883;

import java.util.HashMap;
import java.util.Map;

public class Main {
}

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> dbMap = new HashMap<>();

        for (String[] strings : db) {
            dbMap.put(strings[0], strings[1]);
        }

        String id = id_pw[0];
        String pw = id_pw[1];
        if(dbMap.containsKey(id)) {
            if(dbMap.get(id).equals(pw))
                answer = "login";
            else
                answer = "wrong pw";
        }
        else {
            answer = "fail";
        }
        return answer;
    }
}