package ll.level0.p120883;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("login")
    void test001() {
        assertThat(new Solution().solution(
                new String[] {"meosseugi", "1234"},new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}))
                .isEqualTo("login");
    }

    @Test
    @DisplayName("wrong pw")
    void test002() {
        assertThat(new Solution().solution(
                new String[] {"programmer01", "15789"},new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}))
                .isEqualTo("wrong pw");
    }

    @Test
    @DisplayName("fail")
    void test003() {
        assertThat(new Solution().solution(
                new String[] {"rabbit04", "98761"},new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}))
                .isEqualTo("fail");
    }
}
