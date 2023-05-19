package ll.level0.p120907;

public class Main {
}

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" = ");
            if (cal(s[0]) == Integer.parseInt(s[1]))
                answer[i] = "O";
            else
                answer[i] = "X";
        }

        return answer;
    }

    int cal(String s) {
        String[] str = s.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[2]);
        String op = str[1];

        return switch (op) {
            case "+" -> x + y;
            case "-" -> x - y;
            default -> 0;
        };
    }
}
