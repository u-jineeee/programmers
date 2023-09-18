package ll.level1.p134240;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[] {1, 3, 4, 6})).isEqualTo("1223330333221");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[] {1, 7, 1, 2})).isEqualTo("111303111");
	}
}
