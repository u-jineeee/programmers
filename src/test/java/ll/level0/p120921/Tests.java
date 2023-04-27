package ll.level0.p120921;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("hello ohell => 1")
    void test001() {
        assertThat(new Solution().solution("hello", "ohell")).isEqualTo(1);
    }

    @Test
    @DisplayName("apple elppa => -1")
    void test002() {
        assertThat(new Solution().solution("apple", "elppa")).isEqualTo(-1);
    }

    @Test
    @DisplayName("atat tata => 1")
    void test003() {
        assertThat(new Solution().solution("atat", "tata")).isEqualTo(1);
    }

    @Test
    @DisplayName("abc abc => 0")
    void test004() {
        assertThat(new Solution().solution("abc", "abc")).isEqualTo(0);
    }

    @Test
    @DisplayName("abc bca => 2")
    void test005() {
        assertThat(new Solution().solution("abc", "bca")).isEqualTo(2);
    }
}
