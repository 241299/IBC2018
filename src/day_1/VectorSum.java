package day_1;


import java.util.Arrays;

/**
	Demonstrates how to sum up two vectors of dimension N
	Vectors are represented as arrays
*/

class VectorSum {
	public static void main(String[] args) {

		// Dimension of vectors (how many elements are in arrays)
		final int N = 10;

		// Creating arrays
		int[] a = new int[N],
			b = new int[N],
			c = new int[N];

		// Filling arrays with random numbers
		for (int i = 0; i < N; i++) {
			a[i] = random(10, 1000);
			b[i] = random(10, 1000);
		}

		// Summing arrays to the third array
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println(Arrays.toString(c));
	}

	/**
		Gets random number between a and b
	*/

	static int random (int a, int b) {
		return (int) (Math.random() * (b - a)) + a;
	}
}
