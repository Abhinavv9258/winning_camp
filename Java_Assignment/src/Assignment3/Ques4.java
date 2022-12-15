// Java Program to Find Second Largest and Smallest Elements in an Array

package Assignment3;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Ques4 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int size = arr.length;
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

}
