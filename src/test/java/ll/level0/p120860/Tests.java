package ll.level0.p120860;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("[[1, 1], [2, 1], [2, 2], [1, 2]] => 1")
    void test001() {
        assertThat(new Solution().solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}))
                .isEqualTo(1);
    }

    @Test
    @DisplayName("[[-1, -1], [1, 1], [1, -1], [-1, 1]] => 4")
    void test002() {
        assertThat(new Solution().solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}))
                .isEqualTo(4);
    }
}
