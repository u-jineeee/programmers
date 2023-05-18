package ll.level0.p120880;

public class Main {
}

class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i = 0; i < numlist.length; i++) {
            for(int j = 0; j < numlist.length - 1; j++) {
                int x = numlist[j] - n;
                int y = numlist[j + 1] - n;

                if(Math.abs(x) == Math.abs(y) && x < y) {
                    swap(numlist, j, j+1);
                }
                else if(Math.abs(x) > Math.abs(y)) {
                    swap(numlist, j, j+1);
                }
            }
        }
        return numlist;
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
