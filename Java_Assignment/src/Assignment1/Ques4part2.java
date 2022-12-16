// Input Format
//There are three lines of input:
//1. The first line contains an integer.
//2. The second line contains a double.
//3. The third line contains a String.
//Output Format
//There are three lines of output:
//1. On the first line, print String: followed by the unaltered String read from stdin.
//2. On the second line, print Double: followed by the unaltered double read from stdin.
//3. On the third line, print Int: followed by the unaltered integer read from stdin.

package Assignment1;

import java.util.Scanner;

public class Ques4part2 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer : ");
		int first = scanner.nextInt();
		System.out.println("Enter Double : ");
		double second = scanner.nextDouble();
		System.out.println("Enter String : ");
		String third = scanner.next();

		System.out.println("String : "+third);
		System.out.println("Double : "+second);
		System.out.println("Int : "+first);
	}
}
