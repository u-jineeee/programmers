package ll.level0.p120812;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001() {
        assertThat(new Solution().solution(new int[] {1, 2, 3, 3, 3, 4})).isEqualTo(3);
    }

    @Test
    @DisplayName("예제 2")
    void test002() {
        assertThat(new Solution().solution(new int[] {1, 1, 2, 2})).isEqualTo(-1);
    }

    @Test
    @DisplayName("예제 3")
    void test003() {
        assertThat(new Solution().solution(new int[] {1})).isEqualTo(1);
    }
}
