package ll.level1.p12954;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(2, 5)).isEqualTo(new long[] {2,4,6,8,10});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(4, 3)).isEqualTo(new long[] {4,8,12});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(-4, 2)).isEqualTo(new long[] {-4, -8});
	}
}
