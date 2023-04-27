package ll.level0.p120922;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("2, 2 => 3")
    void test001() {
        assertThat(new Solution().solution(2, 2)).isEqualTo(3);
    }

    @Test
    @DisplayName("2, 5 => 9")
    void test002() {
        assertThat(new Solution().solution(2, 5)).isEqualTo(9);
    }

    @Test
    @DisplayName("1, 1 => 0")
    void test003() {
        assertThat(new Solution().solution(1, 1)).isEqualTo(0);
    }
}
