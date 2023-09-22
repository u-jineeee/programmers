package ll.level1.p42889;

public class Main {
}

class Solution {
	public int[] solution(int N, int[] stages) {
		double people = stages.length;
		int[] fail = new int[N];
		int[] key = new int[N];
		double[] value = new double[N];

		for (int stage : stages) {
			if (N + 1 == stage) continue;
			fail[stage - 1]++;
		}

		for (int i = 0; i < fail.length; i++) {
			key[i] = i+1;
			if (fail[i] == 0) {
				value[i] = 0.0;
			}
			else {
				value[i] = fail[i] / people;
				people -= fail[i];
			}
		}

		for (int i = 0; i < key.length-1; i++) {
			for (int j = 0; j < key.length-i-1; j++) {
				if (value[j] < value[j+1]) {
					double arr = value[j];
					value[j] = value[j+1];
					value[j+1] = arr;

					int arr2 = key[j];
					key[j] = key[j+1];
					key[j+1] = arr2;
				}
			}
		}
		return key;
	}
}
