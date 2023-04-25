package ll.level2.p42860;

public class Main {

}

class Solution {
    public int solution(String name) {
        int a = moveCost(name);
        int b = nameCost(name);
        return nameCost(name) + a;
    }

    private int nameCost(String name) {
        int nameCost = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            nameCost += Math.min(c - 'A', 'Z' - c + 1);
        }

        return nameCost;
    }

    public int moveCost(String name) {
        int moveCost = name.length() - 1;
        int index;

        for(int i = 0; i < name.length(); i++) {
            index = i + 1;

            while(index < name.length() && name.charAt(index) == 'A')
                index++;

            moveCost = Math.min(moveCost, i * 2 + name.length() - index);
            moveCost = Math.min(moveCost, (name.length() - index) * 2 + i);
        }

        return moveCost;
    }
}