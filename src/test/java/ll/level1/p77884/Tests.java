package ll.level1.p77884;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(13, 17)).isEqualTo(43);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(24, 27)).isEqualTo(52);
	}
}
