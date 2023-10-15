package ll.level2.p42577;

import java.util.Arrays;

public class Main {
}

class Solution {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length-1; i++) {
			if (phone_book[i+1].startsWith(phone_book[i]))
				return false;
		}
		return true;
	}
}
