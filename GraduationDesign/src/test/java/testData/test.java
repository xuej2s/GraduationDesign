package testData;

public class test {
	public static void main(String args[]) {
		int result[] = new int[1000];
		int p = 0;

		for (int i = 1; i <= 1000; i++) {
			int temp = 0;

			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					temp = temp + j;
			}

			if (temp == i) {
				result[p] = i;
				p++;
			}
		}

		for (int i = 0; i < p; i++) {
			System.out.println(result[i]);
		}
	}
}