package ll.p120869;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;

        for(String d : dic){
            int cnt = 0;
            for(String s : spell) {
                if(d.contains(s))
                    cnt++;
            }
            if(cnt == spell.length)
                answer++;
        }
        if(answer == 0)
            answer = 2;

        return answer;
    }
}