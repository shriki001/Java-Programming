package Class5;

public class class3 {
	public static int saq(int[] a) {
		int max = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0)
				count = 0;
			else {
				count++;
				if (count > max)
					max = count;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		int[]a={5,-6,7,8,9,-10,11};
		System.out.println(saq(a));
	}

}
