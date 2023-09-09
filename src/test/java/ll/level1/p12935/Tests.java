package ll.level1.p12935;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[] {4, 3, 2, 1})).isEqualTo(new int[] {4, 3, 2});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[] {10})).isEqualTo(new int[] {-1});
	}
}
