package ll.level0.p120861;

public class Main {
    public static void main(String[] args){
    }
}

class Solution {
    public static boolean isBoundary(int bound, int x) {
        if(bound < 0 && bound >= x || bound > 0 && bound <= x)
            return false;

        return true;
    }
    public static int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;

        int maxX = (board[0] - 1)/2;
        int minX = -maxX;
        int maxY = (board[1] - 1)/2;
        int minY = -maxY;

        for(String key : keyinput) {
            switch (key) {
                case "up":
                    if(isBoundary(maxY, y))
                        y++;
                    break;
                case "down":
                    if(isBoundary(minY, y))
                        y--;
                    break;
                case "left":
                    if(isBoundary(minX, x))
                        x--;
                    break;
                case "right":
                    if(isBoundary(maxX, x))
                        x++;
            }
        }
        int[] answer = new int[]{x,y};
        return answer;
    }
}