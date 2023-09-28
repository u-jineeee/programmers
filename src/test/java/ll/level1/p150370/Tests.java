package ll.level1.p150370;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})).isEqualTo(new int[]{1, 3});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})).isEqualTo(new int[]{1, 4, 5});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution("2020.12.17", new String[]{"A 12"}, new String[]{"2010.01.01 A", "2019.12.17 A"})).isEqualTo(new int[]{1, 2});
	}
}
