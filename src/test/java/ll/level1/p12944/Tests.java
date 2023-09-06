package ll.level1.p12944;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001(){
		assertThat(new Solution().solution(new int[]{1,2,3,4})).isEqualTo(2.5);
	}

	@Test
	@DisplayName("예제2")
	void test002(){
		assertThat(new Solution().solution(new int[]{5,5})).isEqualTo(5);
	}
}
