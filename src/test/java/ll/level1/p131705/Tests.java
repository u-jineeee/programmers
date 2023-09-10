package ll.level1.p131705;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[] {-2, 3, 0, 2, -5})).isEqualTo(2);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[] {-3, -2, -1, 0, 1, 2, 3})).isEqualTo(5);
	}
	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new int[] {-1, 1, -1, 1})).isEqualTo(0);
	}
}
