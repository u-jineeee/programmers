package ll.level2.p17684;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("KAKAO")).isEqualTo(new int[]{11, 1, 27, 15});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("TOBEORNOTTOBEORTOBEORNOT")).isEqualTo(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("ABABABABABABABAB")).isEqualTo(new int[]{1, 2, 27, 29, 28, 31, 30});
	}
}
