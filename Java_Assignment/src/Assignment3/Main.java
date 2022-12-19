package Assignment3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nQues1: Sort an array of 0 and 1");
		System.out.println("Enter size of array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i < size; i++){
			arr[i] = scanner.nextInt();
		}
		QuesClass.Ques1(arr,size);
		System.out.println("-------------------------");

		System.out.println("\nQues2: Rotate an array or right shift element by k");
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter value of K: ");
		int k = scanner.nextInt();
		QuesClass.Ques2(array,k);
		System.out.println("-------------------------");

		System.out.println("\nQues3: Finding smallest and largest number in a given Array");
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int sizeArr1 = arr1.length;
		QuesClass.Ques3(arr1,sizeArr1);
		System.out.println("-------------------------");

		System.out.println("\nQues4: Finding Second Largest and Smallest Elements in an Array");
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		int sizeArr2 = arr2.length;
		QuesClass.Ques4(arr2,sizeArr2);
		System.out.println("-------------------------");

		System.out.println("\nQues5: Find the Minimum Distance between Array Elements");
		System.out.println("-------------------------");

		System.out.println("\nQues6: Inserting & Deleting Elements from an Array");
		System.out.println("-------------------------");

		System.out.println("\nQues7: Cyclically Permute the Elements of an Array.");
		System.out.println("-------------------------");

		System.out.println("\nQues8: Find the Missing Element in an Integer Array");
		System.out.println("-------------------------");

		System.out.println("\nQues9: o Print All the Leaders in an Array");
		System.out.println("-------------------------");

		System.out.println("\nQues10: Search for a given number x and print the index at which it occurs");
		System.out.println("-------------------------");

		System.out.println("\nQues11: Hackerrank - Java 1D Array (Part 2)");
		System.out.println("-------------------------");

		System.out.println("\nQues12: Hackerrank - Java 1D Array");
		System.out.println("-------------------------");

		System.out.println("\nQues13: Hackerrank - Java Subarray");
		System.out.println("-------------------------");


	}
}
