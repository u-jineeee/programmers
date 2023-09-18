package ll.level1.p142086;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("banana")).isEqualTo(new int[] {-1, -1, -1, 2, 2, 2});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("foobar")).isEqualTo(new int[] {-1, -1, 1, -1, -1, -1});
	}
}
