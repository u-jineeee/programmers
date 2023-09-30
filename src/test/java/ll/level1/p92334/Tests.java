package ll.level1.p92334;

import static org.assertj.core.api.Assertions.*;

import javax.management.relation.RoleUnresolvedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)).isEqualTo(new int[]{2,1,1,0});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3)).isEqualTo(new int[]{0,0});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new String[]{"ab", "b", "c"}, new String[]{"b ab", "c ab", "c b"}, 2)).isEqualTo(new int[]{0, 1, 1});
	}
}
