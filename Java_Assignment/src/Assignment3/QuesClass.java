package Assignment3;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class QuesClass {
	public static void Ques1(int[] arr, int size){
		int countZero=0;
		for(int i = 0; i<size; i++){
			if(arr[i]==0){
				countZero++;
			}
		}
		for(int i=0;i<countZero;i++){
			arr[i]=0;
		}
		for(int i=countZero; i<size; i++){
			arr[i]=1;
		}
		for(int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}
	}

	public static void Ques2(int[] arr, int k){
		int temp[] = new int[9];
		int i = k-1;
		int j=0;
		for(j=k; j>0; j--){
			temp[i] = arr[9-j];
			i--;
		}
		for(j=k;j>0;j--){
			for(int l=9-j;l>=1;l--){
				arr[l]=arr[l-1];
			}
		}
		for(i=0,j=k;j>0;j--,i++){
			arr[j-1] = temp[i];
		}
		for(j=0;j<9;j++){
			System.out.print(arr[j]+" ");
		}
	}

	public static void Ques3(int[] arr, int size){
		int max = MIN_VALUE;
		int min = MAX_VALUE;
		System.out.print("Original Array : ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]);
		}
		for(int i=0;i<size;i++) {
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("\nMin : "+min);
		System.out.println("Max : "+max);
	}

	public static void Ques4(int[] arr, int size){
		int max = MIN_VALUE;
		int min = MAX_VALUE;
		System.out.print("Original Array : ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]);
		}
		for(int i=0;i<size;i++) {
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		int second_max = MIN_VALUE;
		int second_min = MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]!=max&&second_max < arr[i]){
				second_max = arr[i];
			}
			if(arr[i]!=min&&second_min > arr[i]){
				second_min = arr[i];
			}
		}
		System.out.println("\nSecond Min : "+second_min);
		System.out.println("Second Max : "+second_max);
	}

	public static void Ques6(int[] arr, int size){
		Scanner scanner = new Scanner(System.in);
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
