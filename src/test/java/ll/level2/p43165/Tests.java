package ll.level2.p43165;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001() {
        assertThat(new Solution().solution(new int[] {1, 1, 1, 1, 1}, 3))
                .isEqualTo(5);
    }

    @Test
    @DisplayName("예제 2")
    void test002() {
        assertThat(new Solution().solution(new int[] {4, 1, 2, 1}, 4))
                .isEqualTo(2);
    }

}
