package ll.level1.p160586;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.SoftAssertionError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"})).isEqualTo(new int[]{9, 4});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"AA"}, new String[]{"B"})).isEqualTo(new int[]{-1});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})).isEqualTo(new int[]{4, 6});
	}

	@Test
	@DisplayName("예제4")
	void test004() {
		assertThat(new Solution().solution(new String[]{"ABCDE"}, new String[]{"FGHIJ"})).isEqualTo(new int[]{-1});
	}
}
