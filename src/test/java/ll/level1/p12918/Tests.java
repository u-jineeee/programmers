package ll.level1.p12918;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("a234")).isEqualTo(false);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("1234")).isEqualTo(true);
	}
}
