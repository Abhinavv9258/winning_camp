// How do you sort an array of 0 and 1
// You are given an array of 0s and 1s in random order, and you have to sort this array, i.e., Segregate 0s on the
// left side and 1s on the right side of the array.

package Assignment3;

import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i < size; i++){
			arr[i] = scanner.nextInt();
		}

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

}
