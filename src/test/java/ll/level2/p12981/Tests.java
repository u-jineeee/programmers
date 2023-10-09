package ll.level2.p12981;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})).isEqualTo(new int[]{3, 3});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})).isEqualTo(new int[]{0, 0});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})).isEqualTo(new int[]{1, 3});
	}
}
