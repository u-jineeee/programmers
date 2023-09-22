package ll.level1.p42889;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})).isEqualTo(new int[]{3,4,2,1,5});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(4, new int[]{4,4,4,4,4})).isEqualTo(new int[]{4,1,2,3});
	}
}
