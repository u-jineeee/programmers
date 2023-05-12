package ll.level0.p120878;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001(){
        assertThat(new Solution().solution(7, 20)).isEqualTo(1);
    }

    @Test
    @DisplayName("예제 2")
    void test002(){
        assertThat(new Solution().solution(11, 22)).isEqualTo(1);
    }

    @Test
    @DisplayName("예제 3")
    void test003(){
        assertThat(new Solution().solution(12, 21)).isEqualTo(2);
    }
}
