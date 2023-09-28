package ll.level1.p118666;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5})).isEqualTo("TCMA");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3})).isEqualTo("RCJA");
	}
}
