package ll.level1.p135808;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1})).isEqualTo(8);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2})).isEqualTo(33);
	}
}
