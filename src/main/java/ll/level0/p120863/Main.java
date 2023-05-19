package ll.level0.p120863;

public class Main {
}

class Solution {
    public String solution(String polynomial) {
        String[] n = polynomial.split(" \\+ ");
        int x = 0;
        int y = 0;

        for (String s : n) {
            if (s.contains("x")) {
                String str = s.replaceAll("[^0-9]", "");
                try {
                    x += Integer.parseInt(str);
                } catch(NumberFormatException e) {
                    x += 1;
                }
            } else {
                y += Integer.parseInt(s);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(x != 0) {
            if(x == 1)
                sb.append("x");
            else
                sb.append(x).append("x");
        }
        if(y != 0) {
            if(x != 0)
                sb.append(" + ");
            sb.append(y);
        }

        return sb.toString();
    }
}
