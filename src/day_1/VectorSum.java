class VectorSum {
	public static void main(String[] args) {
		int n = 10, i;
		int[] a = new int[n], c = new int[n];
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (i = 0; i < n; i++) {
			a[i] = (i + 1) * (i + 1);
			c[i] = a[i] + b[i];
		}

		for (i = 0; i < n; i++) {
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
