package ll.level2.p154539;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[]{2, 3, 3, 5})).isEqualTo(new int[]{3, 5, 5, -1});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[]{9, 1, 5, 3, 6, 2})).isEqualTo(new int[]{-1, 5, 6, 6, -1, -1});
	}
}
