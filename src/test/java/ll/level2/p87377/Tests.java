package ll.level2.p87377;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName(" [[1, -1, 0], [2, -1, 0]] => [0, 0]")
    void test1() {
        assertThat(Solution.intersectionPoint(
                new int[]{1, -1, 0}, new int[] {2, -1, 0}
        )).isEqualTo(new Long[]{Long.valueOf(0), Long.valueOf(0)});
    }

    @Test
    @DisplayName(" [[0, 1, -1], [1, 0, -1], [1, 0, 1]] => [\"*.*\"] ")
    void test3() {
        assertThat(Solution.solution(
                new int[][] {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}}
        )).isEqualTo(new String[] {"*.*"});
    }

    @Test
    @DisplayName(" [[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]] ")
    void test4() {
        assertThat(Solution.solution(
                new int[][] {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}}
        )).isEqualTo(new String[] {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"});
    }
}
