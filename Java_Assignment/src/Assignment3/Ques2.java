// How do you rotate an array or right shift element by k

package Assignment3;

import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter value of K: ");
		int k = scanner.nextInt();
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

}
