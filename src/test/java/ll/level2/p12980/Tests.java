package ll.level2.p12980;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(5)).isEqualTo(2);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(6)).isEqualTo(2);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(5000)).isEqualTo(5);
	}
}
