package ll.p120868;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("[1,2] => 1")
    void test001() {
        assertThat(Solution.solution(new int[]{1,2})).isEqualTo(1);
    }

    @Test
    @DisplayName("[3,6] => 5")
    void test002() {
        assertThat(Solution.solution(new int[]{3,6})).isEqualTo(5);
    }

    @Test
    @DisplayName("[11,7] => 13")
    void test003() {
        assertThat(Solution.solution(new int[]{11,7})).isEqualTo(13);
    }
}
