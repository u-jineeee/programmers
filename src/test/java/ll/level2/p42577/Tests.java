package ll.level2.p42577;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"119", "97674223", "1195524421"})).isEqualTo(false);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"123","456","789"})).isEqualTo(true);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"12","123","1235","567","88"})).isEqualTo(false);
	}
}
