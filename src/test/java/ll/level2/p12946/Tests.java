package ll.level2.p12946;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName(" [[1, -1, 0], [2, -1, 0]] => [0, 0]")
    void test1() {
        assertThat(Solution.solution(2)).isEqualTo(
                new int[][] {{1,2}, {1,3}, {2,3}});
    }
}
