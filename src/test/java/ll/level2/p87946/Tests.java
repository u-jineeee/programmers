package ll.level2.p87946;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(80, new int[][]{{80,20},{50,40},{30,10}})).isEqualTo(3);
	}
}
