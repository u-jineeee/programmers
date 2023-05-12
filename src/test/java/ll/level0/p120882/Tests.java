package ll.level0.p120882;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001() {
        assertThat(new Solution()
                .solution(new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}}))
                .isEqualTo(new int[] {1, 2, 4, 3});
    }

    @Test
    @DisplayName("예제 2")
    void test002() {
        assertThat(new Solution()
                .solution(new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}))
                .isEqualTo(new int[] {4, 4, 6, 2, 2, 1, 7});
    }
}
