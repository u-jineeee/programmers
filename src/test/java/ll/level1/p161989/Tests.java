package ll.level1.p161989;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(8, 4, new int[]{2, 3, 6})).isEqualTo(2);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(5, 4, new int[]{1, 3})).isEqualTo(1);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(4, 1, new int[]{1, 2, 3, 4})).isEqualTo(4);
	}
}
