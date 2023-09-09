package ll.level1.p12910;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[] {5, 9, 7, 10}, 5)).isEqualTo(new int[] {5, 10});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[] {2, 36, 1, 3}, 1)).isEqualTo(new int[] {1, 2, 3, 36});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new int[] {3, 2, 6}, 10)).isEqualTo(new int[] {-1});
	}
}
