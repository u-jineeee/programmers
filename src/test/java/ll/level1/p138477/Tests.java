package ll.level1.p138477;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(3, new int[] {10, 100, 20, 150, 1, 100, 200})).isEqualTo(new int[] {10, 10, 10, 20, 20, 100, 100});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})).isEqualTo(new int[] {0, 0, 0, 0, 20, 40, 70, 70, 150, 300});
	}
}
