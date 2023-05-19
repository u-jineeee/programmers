package ll.level0.p120863;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001() {
        assertThat(new Solution().solution("3x + 7 + x")).isEqualTo("4x + 7");
    }

    @Test
    @DisplayName("예제 2")
    void test002() {
        assertThat(new Solution().solution("x + x + x")).isEqualTo("3x");
    }
}
