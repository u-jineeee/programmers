package ll.level1.p12915;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[] {"sun", "bed", "car"}, 1)).isEqualTo(new String[] {"car", "bed", "sun"});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[] {"abce", "abcd", "cdx"}, 2)).isEqualTo(new String[] {"abcd", "abce", "cdx"});
	}
}
