package Assignment1;

import java.util.*;

class Parent extends Grandparent {
	{
		System.out.println("instance - parent");
	}
	public Parent() {
		System.out.println("constructor - parent");
	}
	static {
		System.out.println("static - parent");
	}
}
class Grandparent {
	static {
		System.out.println("static - grandparent");
	}
	{
		System.out.println("instance - grandparent");
	}
	public Grandparent(){
		System.out.println("constructor - grandparent");
	}
}
class Child extends Parent {
	public Child() {
		System.out.println("constructor - child");
	}
	static {
		System.out.println("static - child");
	}
	{
		System.out.println("instance - child");
	}
}

public class QuesClass {

	public static void Ques1(String str){
		System.out.println("Original String : "+str);

		System.out.println("1st Method convert string into character array and using Array.sort() method");
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);

		System.out.println("1st Method convert string into character array and sorting by converting character to int");
		int[] strArray = new int[str.length()];
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
	}

	public static void Ques3(){
		int s = 0;
		int t = 1;
		System.out.println("Without While loop : ");
		for (int i = 0; i < 10; i++)
		{
			s = s + i;
			for (int j = i; j > 0; j--){
				t = t * (j - i);
			}
			s = s * t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);
		System.out.println("---------------------------------------");

		System.out.println("\nWith While loop : ");
		t=1;
		int i = 0;
		while(i<10)
		{
			s = s + i;
			int j = i;
			while(j>0){
				t = t * (j - i);
				j--;
			}
			s = s * t;
			System.out.println("T is " + t);
			i++;
		}
		System.out.println("S is " + s);
	}

	public static void Ques4part2(int first, double second, String third){
		System.out.println("String : "+third);
		System.out.println("Double : "+second);
		System.out.println("Int : "+first);
	}

	public static void Ques5(String[] strArray, int[] intArray){
		for(int i=0;i<3;i++) {
			System.out.printf("%-15s%03d", strArray[i],intArray[i]);
			System.out.println();
		}
	}

	public static void Ques6(String str, int start, int end){
		for(int i=start;i<=end-1;i++){
			System.out.print(str.charAt(i));
		}
	}
}
