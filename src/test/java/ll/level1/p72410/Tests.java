package ll.level1.p72410;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("...!@BaT#*..y.abcdefghijklm")).isEqualTo("bat.y.abcdefghi");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("z-+.^.")).isEqualTo("z--");
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("=.=")).isEqualTo("aaa");
	}

	@Test
	@DisplayName("예제4")
	void test004() {
		assertThat(new Solution().solution("123_.def")).isEqualTo("123_.def");
	}

	@Test
	@DisplayName("예제5")
	void test005() {
		assertThat(new Solution().solution("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn");
	}
}
