import java.util.Arrays;

public class even digits  {
	//The method will return how many even digits in the number
	// we used new method so the method can read the number 0 as an even number
	public static int howManyEven(int num) {
		if (num == 0)
			return 1;
		int ans =	countEvenNumbers(num);
		return ans;
	}
	private static int countEvenNumbers(int num) {
		int counter =0;
		if (num>0) {
			if ((num%10)%2 == 0) {
				counter = counter +1;
			}
			return counter+	countEvenNumbers(num/10);
		}
		return counter;	
	}

	// The method will be given as an array parameter filled with integers
	//It returns the length of the series that exceeds the maximum in the array starting from cell 0
	public int longestAscending(int[] a) {
		if (a.length == 0) {
			return 0;
		}
		else {
			int ans =longestAscending(a,0,1);
			return ans+1;
		}

	}
	private  int longestAscending(int[] a,int i,int j) {
		int counter = 0;
		if (j<a.length) {
			if (a[i]<a[j]) {
				counter = counter +1;
				i=j;
			}
			j=j+1;
			return counter +longestAscending(a,i,j);
		}

		return counter;
	}
	// The method will receive as parameters two arrays sorted in ascending order
	// The method will merge the two arrays into one arranged array
	public static int[] merge(int[] a, int[] b) {
		int[] mergedArray = new int[a.length + b.length];

		int i=0;
		int j=0;
		int k=0; 

		while (i < a.length) 
		{
			mergedArray[k] = a[i];
			i++;
			k++;
		} 

		while (j < b.length) 
		{
			mergedArray[k] = b[j];
			j++;
			k++;
		} 

		Arrays.sort(mergedArray);

		return mergedArray;

	} 
	// The method will accept as two string parameters. 
	//The method will return true if both strings are equal
	public static boolean equalIgnoreCase(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		if (s1.equals("")) {
			return true;
		}
		char char_s1 = s1.charAt(0);
		char char_s2 = s2.charAt(0);
		if (char_s1 >= 'a' && char_s1 <= 'z') {
			char_s1 -= 32;
		}
		if (char_s2 >= 'a' && char_s2 <= 'z') {
			char_s2 -= 32;
		}
		if (char_s1 == char_s2) {
			return equalIgnoreCase(s1.substring(1), s2.substring(1));
		} else {
			return false;
		}

	}
}

