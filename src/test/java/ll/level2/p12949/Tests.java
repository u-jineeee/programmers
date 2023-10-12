package ll.level2.p12949;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}})).isEqualTo(new int[][] {{15, 15}, {15, 15}, {15, 15}});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}},  new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})).isEqualTo(new int[][] {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}},  new int[][]{{5, 4}, {2, 4}, {3, 1}})).isEqualTo(new int[][] {{22, 22}, {36, 28}, {29, 20}});
	}
}
