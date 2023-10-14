package ll.level2.p42578;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}})).isEqualTo(5);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}})).isEqualTo(3);
	}
}
