public class Loops {
	// This method sees how many digits there is in the number and return it
		public static int howManyDigits(int num) {
			int counter=0;
			while(num>0) {
				num/=10;
				counter++;
			}
			return counter;
		}
		// This method do the sum of all digits 
		public static int sumDigits(int num) {
			int sum=0;
			while(num>0) {
				sum=sum + num%10;
				num/=10;
			}
			return sum;
		}
		// This method sees what is the last digit in the number
		public static int lastDigit(int x,int num) {
			int lastdigit=0;
			for(int i=0;i<howManyDigits(num);i++) {
				lastdigit+=x%10 *(Math.pow(10, i));
				x/=10;
			}
			return lastdigit;
		}
		// It print the multiplication of the number 
		public static int specialMult(int n) {
			// If the number between 1-9 the result will be the same number
			if(n>=1 && n<=9)
				return n;
			// if the number 11. there is not an answer
			else if(n == 11) {
				return 0;
			}
			// if the number 10 or bigger than 12 it searches for the result
			else {
				int x=0;
				boolean found =false;
				while(!found) {
					if(x%n ==0 && lastDigit (x,n)== n && sumDigits(x)== n) {
						found =true;
						return x;
					}
					x++;
				}
			}
			return 0;
		}
		// it prints all the numbers that have an answer until the given number
		public static void printAllSpecialMult(int n) {
			for(int i=1;i<=n;i++) {
				System.out.println(i+"\t"+specialMult(i));
			}
		}
		//The method will obtain a positive integer parameters n and d. 
		//It will print the number with commas depends on d (starting from the right).
		public static void printWithComma(int n, int d) {
			String finalResult="";
			String stringnum="" + n;
			int numDigits=howManyDigits(n);
			if(n<=0 && d<0 && numDigits==1 && numDigits<=d ) {
				System.out.println(n);
			}
			else {
				for(int i=1; i<numDigits +1 ; i++) {
					finalResult=finalResult +stringnum.charAt(i-1);
					finalResult=finalResult + ((((numDigits-i)%d==0)&& i!= numDigits)?",":"");
				}
			}
			System.out.println(finalResult);
		}
}
