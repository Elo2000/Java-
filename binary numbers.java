import java.util.Scanner;

public class binary numbers {
	//The method gets an integer n. 
	//The method will print all binary numbers that can be made. 
	public static void printAllBinary(int n){
		printBinaryNumber(" ", n);
	}
	// private helping method for printing binary numbers.
	private static void printBinaryNumber(String s, int n){
		if(n < 0) 
			System.out.print(" ");
		if(n == 0) {
			System.out.print(s+",");
			return;
		}
		printBinaryNumber(s + 0, n-1);
		printBinaryNumber(s + 1, n-1);
	}
	//The method gets a string s.
	//The method will print all words that can be built from the letters s.
	public static void printSubs(String s) {
		printSubsStrings(s, " ");
	}
	// private helping method to build the words 
	private static void  printSubsStrings(String string1,String previous) {
		if(string1.length()== 0){
			System.out.println(previous);
			return;
		}
		printSubsStrings(string1.substring(1),previous);
		printSubsStrings(string1.substring(1),previous+Character.toString(string1.charAt(0)));

	}
}