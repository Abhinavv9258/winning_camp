// WAP to sorting string without using string Methods

package Assignment1;

import java.util.Arrays;

public class Ques1 {
	public static void main(String[] args){
		System.out.println("-------------------------");
		String str = "abhinavverma";
		System.out.println("Original String : "+str);
		System.out.println("-------------------------");

		System.out.println("1st Method convert string into character array and using Array.sort() method");
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		System.out.println("-------------------------");

		System.out.println("1st Method convert string into character array and sorting by converting character to int");
		int strArray[] = new int[str.length()];
		for(int i = 0; i < strArray.length; i++){
			strArray[i] = (int) str.charAt(i);
		}

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i+1; j < strArray.length; j++) {
				if(strArray[i] > strArray[j]){
					int temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}

		for(int i = 0; i < strArray.length; i++){
			System.out.print((char)strArray[i]);
		}
		System.out.println("\n-------------------------");
	}
}
