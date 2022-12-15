// Find out smallest and largest number in a given Array?

package Assignment3;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Ques3 {
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
		System.out.println("\nMin : "+min);
		System.out.println("Max : "+max);
	}

}
