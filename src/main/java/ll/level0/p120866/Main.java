package ll.level0.p120866;

public class Main {
}

class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board.length;

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    answer--;
                }
                else {
                    if(i - 1 >= 0) {
                        if(j - 1 >= 0 && board[i - 1][j - 1] == 1) {
                            answer--;
                            continue;
                        }
                        if(board[i - 1][j] == 1) {
                            answer--;
                            continue;
                        }
                        if(j + 1 < board.length && board[i - 1][j + 1] == 1) {
                            answer--;
                            continue;
                        }
                    }
                    if(j - 1 >= 0 && board[i][j - 1] == 1) {
                        answer--;
                        continue;
                    }
                    if(j + 1 < board.length && board[i][j + 1] == 1) {
                        answer--;
                        continue;
                    }
                    if(i + 1 < board.length) {
                        if(j - 1 >= 0 && board[i + 1][j - 1] == 1) {
                            answer--;
                            continue;
                        }
                        if(board[i + 1][j] == 1) {
                            answer--;
                            continue;
                        }
                        if(j + 1 < board.length && board[i + 1][j + 1] == 1) {
                            answer--;
                        }
                    }
                }
            }
        }
        return answer;
    }
}