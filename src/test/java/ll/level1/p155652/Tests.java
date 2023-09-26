package ll.level1.p155652;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("aukks", "wbqd", 5)).isEqualTo("happy");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("y", "baz", 1)).isEqualTo("c");
	}
}
