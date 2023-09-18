package ll.level1.p68644;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[] {2,1,3,4,1})).isEqualTo(new int[] {2,3,4,5,6,7});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[] {5,0,2,7})).isEqualTo(new int[] {2,5,7,9,12});
	}
}
