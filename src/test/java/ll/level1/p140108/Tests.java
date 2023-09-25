package ll.level1.p140108;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("banana"	)).isEqualTo(3);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("abracadabra")).isEqualTo(6);
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("aaabbaccccabba")).isEqualTo(3);
	}
}
