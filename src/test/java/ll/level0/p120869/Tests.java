package ll.level0.p120869;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("[\"p\", \"o\", \"s\"], [\"sod\", \"eocd\", \"qixm\", \"adio\", \"soo\"] => 2")
    void test001() {
        assertThat(Solution.solution(
                new String[]{"p", "o", "s"},
                new String[]{"sod", "eocd", "qixm", "adio", "soo"}))
                .isEqualTo(2);
    }

    @Test
    @DisplayName("[\"z\", \"d\", \"x\"], [\"def\", \"dww\", \"dzx\", \"loveaw\"] => 1")
    void test002() {
        assertThat(Solution.solution(
                new String[]{"z", "d", "x"},
                new String[]{"def", "dww", "dzx", "loveaw"}))
                .isEqualTo(1);
    }

    @Test
    @DisplayName("[\"s\", \"o\", \"m\", \"d\"], [\"moos\", \"dzx\", \"smm\", \"sunmmo\", \"som\"] => 2")
    void test003() {
        assertThat(Solution.solution(
                new String[]{"s", "o", "m", "d"},
                new String[]{"moos", "dzx", "smm", "sunmmo", "som"}))
                .isEqualTo(2);
    }
}
