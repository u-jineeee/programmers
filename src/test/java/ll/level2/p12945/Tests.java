package ll.level2.p12945;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("3 => 2")
    void test001() {
        assertThat(new Solution().solution(3)).isEqualTo(2);
    }

    @Test
    @DisplayName("5 => 5")
    void test002() {
        assertThat(new Solution().solution(5)).isEqualTo(5);
    }
}
