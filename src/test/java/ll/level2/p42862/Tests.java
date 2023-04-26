package ll.level2.p42862;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("5 [2, 4] [1, 3, 5] => 5 ")
    void test001() {
        assertThat(
                new Solution().solution(5, new int[] {2,4}, new int[] {1,3,5}))
                .isEqualTo(5);
    }

    @Test
    @DisplayName("5 [2, 4] [3] => 4 ")
    void test002() {
        assertThat(
                new Solution().solution(5, new int[] {2,4}, new int[] {3}))
                .isEqualTo(4);
    }

    @Test
    @DisplayName("3 [3] [1] => 2 ")
    void test003() {
        assertThat(
                new Solution().solution(3, new int[] {3}, new int[] {1}))
                .isEqualTo(2);
    }

}
