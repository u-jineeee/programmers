package ll.level2.p84512;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("AAAAE")).isEqualTo(6);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("AAAE")).isEqualTo(10);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("I")).isEqualTo(1563);
	}

	@Test
	@DisplayName("예제4")
	void test004() {
		assertThat(new Solution().solution("EIO")).isEqualTo(1189);
	}
}
