package ll.level1.p12901;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(5, 24)).isEqualTo("TUE");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(9, 1)).isEqualTo("THU");
	}
}
