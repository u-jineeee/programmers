package ll.level2.p12914;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(4)).isEqualTo(5);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(3)).isEqualTo(3);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(5)).isEqualTo(8);
	}
}
