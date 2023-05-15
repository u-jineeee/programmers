package ll.level0.p120871;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("15 -> 25")
    void test001() {
        assertThat(new Solution().solution(15)).isEqualTo(25);
    }

    @Test
    @DisplayName("40 -> 76")
    void test002() {
        assertThat(new Solution().solution(40)).isEqualTo(76);
    }
}
