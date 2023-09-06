package ll.level1.p12931;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(123)).isEqualTo(6);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(987)).isEqualTo(24);
	}
}
