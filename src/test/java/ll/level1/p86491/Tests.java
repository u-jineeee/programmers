package ll.level1.p86491;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}})).isEqualTo(4000);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}})).isEqualTo(120);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}})).isEqualTo(133);
	}
}
