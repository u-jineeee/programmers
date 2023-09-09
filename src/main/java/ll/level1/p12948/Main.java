package ll.level1.p12948;

public class Main {
}

class Solution {
	public String solution(String phone_number) {
		String back_number = phone_number.substring(phone_number.length()-4, phone_number.length());
		return "*".repeat(Math.max(0, phone_number.length() - 4))
			+ back_number;
	}
}