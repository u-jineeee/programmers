package ll.level1.p12928;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(12)).isEqualTo(28);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(5)).isEqualTo(6);
	}
}
