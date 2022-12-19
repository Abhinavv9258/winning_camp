package Assignment1;

import static Assignment1.QuesClass.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ques1: WAP to sorting string without using string Methods");
		System.out.println("Enter string: ");
		String str1 = scanner.next();
		Ques1(str1);
		System.out.println("\n-------------------------");

		System.out.println("\nQues3: Convert the following code so that it uses nested while statements instead of for statements:");
		Ques3();
		System.out.println("\n-------------------------");

		System.out.println("\nQues4 Part1: Output on new Child();");
		new Child();
		System.out.println("\n-------------------------");

		System.out.println("Ques4 Part2: There are three lines of input: \n"+
				"1. The first line contains an integer.\n"+
				"2. The second line contains a double.\n"+
				"3. The third line contains a String.");
		System.out.println("Enter Integer : ");
		int first = scanner.nextInt();
		System.out.println("Enter Double : ");
		double second = scanner.nextDouble();
		System.out.println("Enter String : ");
		String third = scanner.next();
		Ques4part2(first, second, third);
		System.out.println("\n-------------------------");

		System.out.println("Ques5: Formatting output using printf");
		String[] strArray = new String[3];
		int[] intArray = new int[3];
		for(int i=0;i<3;i++)
		{
			strArray[i]=scanner.next();
			intArray[i]=scanner.nextInt();
		}
		Ques5(strArray,intArray);
		System.out.println("\n-------------------------");

		System.out.println("\nQues6: Print the substring in the inclusive range from start to end -1");
		String str2 = scanner.next();
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		Ques6(str2,start,end);
		System.out.println("\n-------------------------");



	}
}
