package ll.level1.p87389;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(10)).isEqualTo(3);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(12)).isEqualTo(11);
	}
}
