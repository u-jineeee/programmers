package ll.level0.p120853;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("1 2 Z 3 => 4")
    void test001(){
        assertThat(Solution.solution("1 2 Z 3")).isEqualTo(4);
    }
}
