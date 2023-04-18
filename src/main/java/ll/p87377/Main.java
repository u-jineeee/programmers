package ll.p87377;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public static Long[] intersectionPoint(int[] line1, int[] line2) {
        // Ax + By + E = 0
        // Cx + Dy + F = 0
        long A = line1[0];
        long B = line1[1];
        long E = line1[2];

        long C = line2[0];
        long D = line2[1];
        long F = line2[2];

        if (A * D - B * C == 0)
            return null;

        double x = (double) (B * F - E * D) / (A * D - B * C);
        double y = (double) (E * C - A * F) / (A * D - B * C);

        if (x == (long) x && y == (long) y) {
            return new Long[]{(long) x, (long) y};
        }

        return null;
    }

    public static String[] solution(int[][] line) {

        Set<Long[]> pointSet = new HashSet<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Long[] point = intersectionPoint(line[i], line[j]);

                if (point == null)
                    continue;

                pointSet.add(point);
            }
        }

        long minX = pointSet.stream().min((o1, o2) -> (int) (o1[0] - o2[0])).get()[0];
        long maxX = pointSet.stream().max((o1, o2) -> (int) (o1[0] - o2[0])).get()[0];
        long minY = pointSet.stream().min((o1, o2) -> (int) (o1[1] - o2[1])).get()[1];
        long maxY = pointSet.stream().max((o1, o2) -> (int) (o1[1] - o2[1])).get()[1];

        String[][] star = new String[(int) (maxY - minY + 1)][];
        for (int i = 0; i < maxY - minY + 1; i++) {
            star[i] = ".".repeat((int) (maxX - minX + 1)).split("");
        }

        for (Long[] point : pointSet) {
            int x = (int) (point[0] - minX);
            int y = (int) (point[1] - minY);
            star[y][x] = "*";
        }

        String[] answer = new String[star.length];
        for (int i = 0; i < star.length; i++) {
            answer[i] = String.join("", star[(int) (maxY - minY - i)]);
        }

        return answer;
    }
}

