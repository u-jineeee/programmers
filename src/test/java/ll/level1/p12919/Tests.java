package ll.level1.p12919;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[] {"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
	}
}
