package ll.level0.p120876;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][] {{0, 1}, {2, 5}, {3, 9}}))
			.isEqualTo(2);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][] {{-1, 1}, {1, 3}, {3, 9}}))
			.isEqualTo(0);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new int[][] {{0, 5}, {3, 9}, {1, 10}}))
			.isEqualTo(8);
	}
}
