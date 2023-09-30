package ll.level1.p172928;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"})).isEqualTo(new int[]{2,1});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"})).isEqualTo(new int[]{0,1});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"})).isEqualTo(new int[]{0,0});
	}
}
