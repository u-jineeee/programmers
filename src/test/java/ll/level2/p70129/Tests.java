package ll.level2.p70129;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("110010101001")).isEqualTo(new int[]{3,8});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("01110")).isEqualTo(new int[]{3,3});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("1111111")).isEqualTo(new int[]{4,1});
	}
}
