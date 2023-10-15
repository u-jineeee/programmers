package ll.level2.p42587;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[]{2, 1, 3, 2}, 2)).isEqualTo(1);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[]{1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
	}
}
