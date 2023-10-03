package ll.level2.p12951;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("3people unFollowed me")).isEqualTo("3people Unfollowed Me");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("for the last week")).isEqualTo("For The Last Week");
	}
}
