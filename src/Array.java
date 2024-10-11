import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input size and create array
		int size;
		do {
			System.out.print("Enter the size of the array (0 < size < 10): ");
			size = input.nextInt();
		} while (size <= 0 || size >= 10);
		int[] array = new int[10];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the " + (i+1) + "th number of the array: ");
			array[i] = input.nextInt();
		}
		// show array elements
		System.out.print("Array elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		// input value and position to insert to the array
		System.out.println("\nEnter a value you want to insert to the array: ");
		int value = input.nextInt();
		int position;
		do {
			System.out.println("Enter the position you want to insert to (position < size):");
			position = input.nextInt();
		} while (position < 0 || position >= size);

		// insert value to array
		for (int i = size; i > position; i--) {
			array[i] = array[i-1];
		}
		array[position] = value;

		// show array elements after insertion
		System.out.print("Array elements after insertion: ");
		for (int i = 0; i < size+1; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
