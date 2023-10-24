package ll.level2.p12913;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}})).isEqualTo(16);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{6, 7, 1, 2}, {2, 3, 10, 8}, {1, 3, 9, 4}, {7, 11, 4, 9}})).isEqualTo(35);
	}
}
