package ll.level1.p64061;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4})).isEqualTo(4);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 4, 4, 0}, {1, 2, 2, 1}}, new int[]{2, 3, 1, 4, 2, 3})).isEqualTo(6);
	}
}
