// Java Programs on Inserting & Deleting Elements from an Array

package Assignment3;

import java.util.Scanner;

public class Ques6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i < size; i++){
			arr[i] = scanner.nextInt();
		}
		System.out.print("\nArray after insertion : ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+" ");
		}

//		we can't remove or delete elements directly, so we have to create new array and store elements in it
//		except the element we want to remove
		System.out.print("\nEnter element index you want to remove from array : ");
		int temp = scanner.nextInt();
		int temp_array[] = new int[size-1];
		for(int i=0,k=0;i<size;i++){
			if(i!=temp){
				temp_array[k] = arr[i];
				k++;
			}
		}

		System.out.print("\nArray after deletion of "+temp+"th element : ");
		for(int i = 0; i < size-1; i++){
			System.out.print(temp_array[i]+" ");
		}
		System.out.println();
	}
}
