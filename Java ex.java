public class Ex7 {

	//The method will get a two-dimensional square and number x.
	//The method returns true if x is in array and false if not.
	// Running time efficiency: 0(logn)
	public static boolean find(int[][] a, int x) {
		int row=0;
		int colum=a[0].length-1;
		while(colum>=0 && row<a.length) {
			if(x<a[row][colum]) {
				colum--;
			}
			else if(x>a[row][colum]) {
				row++;
			}
			else {
				return true;
			}
		}
		return false;
	}

	// An array that all even organs indexes are sorted in ascending order
	//And all odd organs indexes are sorted in descending order.
	// The method returns the index of x in the array, if any, or -1 if none exists.
	// Running time efficiency: 0(logn)
	public static int find(int[] a, int x) {
		int leftEven=0;
		int rightEven=a.length-1;
		int leftOdd=0;
		int rightOdd=a.length-1;

		while(leftEven<rightEven || leftOdd<rightOdd) {
			int middleEven=leftEven+ (rightEven-leftEven)/2;
			int middleOdd=leftOdd+ ((rightOdd-leftOdd)/2);
			if(middleEven%2!=0) {
				middleEven--;
			}
			if(middleOdd%2==0) {
				middleOdd++;
			}
			if(a[middleEven]==x) {
				return middleEven;
			}
			if(a[middleOdd] == x) {
				return middleOdd;
			}
			if(a[middleEven]>x) {
				rightEven=middleEven-1;
			}
			else {
				leftEven=middleEven+1;
			}
			if(a[middleOdd]<x) {
				rightOdd=middleOdd-1;
			}
			else {
				leftOdd=middleOdd+1;
			}
		}
		return -1;
	}
	
	// The method gets string parameters and two characters.
	//The method returns how many sub-strings there are in the string.
	// Running time efficiency: 0(n)
	public static int countSub(String s, char first, char last) {
		int firstSum = 0;
		int secondSum = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == last) {
				firstSum += secondSum;
			}

			if (s.charAt(i) == first) {
				secondSum++;
			} else {
				continue;
			}
		}
		return firstSum;
	}
}


