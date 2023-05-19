package ll.level0.p120924;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001() {
        assertThat(new Solution().solution(new int[] {1, 2, 3, 4})).isEqualTo(5);
    }

    @Test
    @DisplayName("예제 2")
    void test002() {
        assertThat(new Solution().solution(new int[] {2, 4, 8})).isEqualTo(16);
    }
}
