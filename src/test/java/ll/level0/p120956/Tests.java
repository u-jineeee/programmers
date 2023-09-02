package ll.level0.p120956;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"}))
			.isEqualTo(1);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}))
			.isEqualTo(3);
	}
}
