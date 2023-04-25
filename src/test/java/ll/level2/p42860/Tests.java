package ll.level2.p42860;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("A => 0")
    void test001() {
        assertThat(new Solution().solution("A")).isEqualTo(0);
    }

    @Test
    @DisplayName("Z => 1")
    void test002() {
        assertThat(new Solution().solution("Z")).isEqualTo(1);
    }

    @Test
    @DisplayName("JEROEN => 56")
    void test003() {
        assertThat(new Solution().solution("JEROEN")).isEqualTo(56);
    }

    @Test
    @DisplayName("AAAAA => 0")
    void test004() {assertThat(new Solution().solution("AAAAA")).isEqualTo(0); }

    @Test
    @DisplayName("JAN => 23")
    void test005() {assertThat(new Solution().solution("JAN")).isEqualTo(23);}

    @Test
    @DisplayName("BBBBAAAAAAAB => 10")
    void test006() {
        assertThat(new Solution().solution("BBBBAAAAAAAB")).isEqualTo(10);
    }
}
