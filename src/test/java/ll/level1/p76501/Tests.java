package ll.level1.p76501;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new int[] {4, 7, 12}, new boolean[] {true,false,true})).isEqualTo(9);
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new int[] {1, 2, 3}, new boolean[] {false,false,true})).isEqualTo(0);
	}
}
