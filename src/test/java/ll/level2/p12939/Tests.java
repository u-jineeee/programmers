package ll.level2.p12939;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("1 2 3 4")).isEqualTo("1 4");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("-1 -2 -3 -4")).isEqualTo("-4 -1");
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("-1 -1")).isEqualTo("-1 -1");
	}
}
