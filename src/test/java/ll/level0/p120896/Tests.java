package ll.level0.p120896;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {

    @Test
    @DisplayName("abcabcadc => d")
    void t1(){
        assertThat(new Solution().solution("abcabcadc")).isEqualTo("d");
    }
    @Test
    @DisplayName("abdc => abdc")
    void t2(){
        assertThat(new Solution().solution("abdc")).isEqualTo("abdc");
    }
    @Test
    @DisplayName("hello => eho")
    void t3(){
        assertThat(new Solution().solution("hello")).isEqualTo("eho");
    }
}
