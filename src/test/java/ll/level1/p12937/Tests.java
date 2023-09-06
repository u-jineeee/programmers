package ll.level1.p12937;

import static org.assertj.core.api.Assertions.*;

import javax.management.relation.RoleUnresolvedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(3)).isEqualTo("Odd");
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(4)).isEqualTo("Even");
	}
}
