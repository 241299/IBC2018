package day_1;

class Array {
	public static void main(String[] args) {
		// Create n
		int n = 10;
		
		// Create and initialize an array
		int[] a = new int[n];
		
		// FOR //
		
		// Fill the array
		for (int i = 0; i < n; i++) {
			a[i] = (i + 1) * (i + 1);
		}
		
		// Print the contents
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
		// WHILE //
		// Select and uncomment the code below using Ctrl + /
		
//		// Create iterable
//		int i = 0;
//		
//		while (i < n) {
//			a[i] = (i + 1) * (i + 1);
//			i++;
//		}
//
//		i = 0;
//		while (i < n) {
//			System.out.println(a[i]);
//			i++;
//		}

	}
}
