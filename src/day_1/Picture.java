package day_1;

class Picture {
	public static void main(String[] args) {
		// Define how many rows we need. final means it is constant
		final int N = 6;
		
		// Outer loop for rows
		for (int i = 0; i < N; i++) {
			
			// Inner loop for spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			// Print star and change the line
			System.out.print("*\n");
		}
	}
}
