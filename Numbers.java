import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter a number between 100 to 99999.");
		int number = input.nextInt();

		if (number >99 && number < 1000) {

			int firstDigit = (int) (Math.pow(number/100, 3));
			int thirdDigit = (int) (Math.pow((number %10), 3));
			int secondDigit = (int) (Math.pow(((number%100)/10), 3)) ;

			if (firstDigit + thirdDigit+ secondDigit == number) {
				System.out.println("The Number: " + number + " is an Armstrong number.");
			}
			else {
				System.out.println("The Number: " + number + " is not an Armstrong number.");
			}}
		else if (number > 999 && number <10000) {

			int firstDigit = (number/1000);
			int secondDigit = ((number%1000)/100);
			int thirdDigit = ((number % 100)/10);
			int forthDigit = (number %10);
			if (firstDigit == forthDigit  && secondDigit == thirdDigit) {
				System.out.println("The Number: " + number + " is a palindrome.");
			}
			else {
				System.out.println("The Number " + number + " is not a palindrome.");
			}}

		else if (number > 9999 && number <100000) {

			int firstDigit= (number/10000);
			int secondDigit= ((number%10000)/1000);
			int thirdDigit=((number % 1000)/100);
			int forthDigit= ((number % 100)/10);
			int fifthDigit= (number % 10);
			if (firstDigit == fifthDigit && secondDigit == forthDigit) {
				System.out.println("The Number: " + number + " is a palindrome.");
			}
			else {
				System.out.println("The Number: " + number + " is not a palindrome.");
			}}

		else {
			System.out.println("The Number: "+ number + " is invalid.");
		}

	}}
