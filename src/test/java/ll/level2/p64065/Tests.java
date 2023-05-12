package ll.level2.p64065;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("예제 1")
    void test001(){
        assertThat(new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(new int[] {2, 1, 3, 4});
    }

    @Test
    @DisplayName("예제 2")
    void test002(){
        assertThat(new Solution().solution("{{20,111},{111}}")).isEqualTo(new int[] {111, 20});
    }
}
