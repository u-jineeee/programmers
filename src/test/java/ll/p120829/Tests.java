package ll.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("70 => 1")
    void t1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }
    @Test
    @DisplayName("91 => 3")
    void t2(){
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }
}
