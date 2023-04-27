package ll.level2.p42586;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("[93, 30, 55] [1, 30, 5] => [2, 1]")
    void test001() {
        assertThat(
                new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}))
                .isEqualTo(new int[]{2, 1});
    }

    @Test
    @DisplayName("[95, 90, 99, 99, 80, 99] [1, 1, 1, 1, 1, 1] => [1, 3, 2]")
    void test002() {
        assertThat(
                new Solution().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}))
                .isEqualTo(new int[]{1, 3, 2});
    }

    @Test
    @DisplayName("[90, 90, 90, 90] [30, 1, 1, 1] => [1, 3]")
    void test003() {
        assertThat(
                new Solution().solution(new int[]{90, 90, 90, 90}, new int[]{30, 1, 1, 1}))
                .isEqualTo(new int[]{1, 3});
    }

    @Test
    @DisplayName("[1, 1, 1, 1] [100, 50, 99, 100] => [1, 3]")
    void test004() {
        assertThat(
                new Solution().solution(new int[]{1, 1, 1, 1}, new int[]{100, 50, 99, 100}))
                .isEqualTo(new int[]{1, 3});
    }
}
