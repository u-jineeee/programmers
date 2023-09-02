package ll.level0.p120875;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}}))
			.isEqualTo(1);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}}))
			.isEqualTo(0);
	}
}
