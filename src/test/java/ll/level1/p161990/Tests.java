package ll.level1.p161990;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	@DisplayName("예제1")
	void test001() {
		assertThat(new Solution().solution(new String[]{".#...", "..#..", "...#."})).isEqualTo(new int[]{0, 1, 3, 4});
	}

	@Test
	@DisplayName("예제2")
	void test002() {
		assertThat(new Solution().solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})).isEqualTo(new int[]{1, 3, 5, 8});
	}

	@Test
	@DisplayName("예제3")
	void test003() {
		assertThat(new Solution().solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})).isEqualTo(new int[]{0, 0, 7, 9});
	}

	@Test
	@DisplayName("예제4")
	void test004() {
		assertThat(new Solution().solution(new String[]{"..", "#."})).isEqualTo(new int[]{1, 0, 2, 1});
	}
}
