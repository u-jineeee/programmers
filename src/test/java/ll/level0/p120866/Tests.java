package ll.level0.p120866;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001() {
        assertThat(new Solution().solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}))
                .isEqualTo(16);
    }

    @Test
    @DisplayName("예제 2")
    void test002() {
        assertThat(new Solution().solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}))
                .isEqualTo(13);
    }

    @Test
    @DisplayName("예제 3")
        void test003() {
        assertThat(new Solution().solution(new int[][] {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}))
                .isEqualTo(0);
    }

    @Test
    @DisplayName("예제 4")
    void test004() {
        assertThat(new Solution().solution(new int[][] {{0}}))
                .isEqualTo(1);
    }

    @Test
    @DisplayName("예제 5")
    void test005() {
        assertThat(new Solution().solution(new int[][]{{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}}))
                .isEqualTo(36);
    }

    @Test
    @DisplayName("예제 6")
    void test006() {
        assertThat(new Solution().solution(new int[][]{{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 1}}))
                .isEqualTo(17);
    }
}
