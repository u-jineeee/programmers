package ll.level1.p132267;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(2, 1, 20)).isEqualTo(19);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(3, 1, 20)).isEqualTo(9);
	}
}
