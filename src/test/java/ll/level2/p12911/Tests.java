package ll.level2.p12911;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(78)).isEqualTo(83);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(15)).isEqualTo(23);
	}
}
