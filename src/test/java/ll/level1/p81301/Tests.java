package ll.level1.p81301;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("one4seveneight")).isEqualTo(1478);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("23four5six7")).isEqualTo(234567);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("2three45sixseven")).isEqualTo(234567);
	}
	@Test
	@DisplayName("예제4")
	void test004() {
		assertThat(new Solution().solution("123"	)).isEqualTo(123);
	}
}
