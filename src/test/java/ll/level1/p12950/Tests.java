package ll.level1.p12950;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}}))
			.isEqualTo(new int[][] {{4, 6}, {7, 9}});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][] {{1}, {2}}, new int[][] {{3}, {4}}))
			.isEqualTo(new int[][] {{4}, {6}});
	}
}
