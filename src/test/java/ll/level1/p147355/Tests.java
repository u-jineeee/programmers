package ll.level1.p147355;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("3141592", "271")).isEqualTo(2);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("500220839878", "7")).isEqualTo(8);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("10203", "15")).isEqualTo(3);
	}
}
