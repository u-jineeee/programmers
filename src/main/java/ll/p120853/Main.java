package ll.p120853;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public static int solution(String s) {
        int answer = 0;

        String[] array = s.split(" ");

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals("Z")) {
                answer -= Integer.parseInt(array[i - 1]);
            }
            else {
                answer += Integer.parseInt(array[i]);
            }
        }
        return answer;
    }
}
