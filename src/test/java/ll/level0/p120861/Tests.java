package ll.level0.p120861;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("입출력 예#1")
    void test001(){
        assertThat(Solution.solution(
                new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}))
                .isEqualTo(new int[]{2, 1});
    }

    @Test
    @DisplayName("입출력 예#2")
    void test002(){
        assertThat(Solution.solution(
                new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}))
                .isEqualTo(new int[]{0, -4});
    }
}
