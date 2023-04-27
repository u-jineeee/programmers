package ll.level0.p120884;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("100 => 11")
    void test001() {
        assertThat(new Solution().solution(100)).isEqualTo(11);
    }

    @Test
    @DisplayName("1,081 => 120")
    void test002() {
        assertThat(new Solution().solution(1081)).isEqualTo(120);
    }
}
