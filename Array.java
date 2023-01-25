public class Array {
	// It represent an array of integers.
	private int num;
	private int [] numbers= new int [num];

	public Array(int[] array) {
		this.num=array.length;
		this.numbers=array;
	} 
	//The method takes parameter 
	//It returns true if the array represented by "other", false if the array represented by "this".
	public boolean isPrefix(Array other) {
		for ( int i = 0; i<other.numbers.length;i++) { 
			if (other.numbers[i]!=numbers[i]) 
				return false;
		} 
		return true;
	}
	//The method takes parameter 
	//It returns true if the array represented by "other", false if the array represented by "this".
	public boolean isSuffix(Array other) {
		int diff = numbers.length-other.numbers.length;
		for (int j=0;j < other.numbers.length;j++) {
			if (numbers[j+diff]!=other.numbers[j]) 
				return false;
		}
		return true;
	} 
	//The method takes parameter and return an Array object which is the shared rank of the two arrays.
	public Array longestCommonPrefix(Array other) { 
		int count = 0 ;
		for ( int i = 0; i<numbers.length;i++) { 
			if (other.numbers[i]==numbers[i]) {
				count++;
			} } 
		int [] commonPrefix = new int [count];
		for (int i = 0; i<count ;i++) {
			commonPrefix[i]=this.numbers[i]; 
		} 
		return new Array(commonPrefix);
	} 
	//The method takes parameter and return an Array object which is the longest shared byte of the two arrays
	public Array longestCommonSuffix(Array other) { 
		int count =0;
		int diff = numbers.length-other.numbers.length;
		if (diff > 0) {
			for (int i=0;i < numbers.length;i++) {
				if (numbers[i+diff]==other.numbers[i]) 
					count++; 
				else count = 0;
			} } 
		if (diff <0) {
			diff = Math.abs(diff); 
			for (int i=0;i < numbers.length;i++) { 
				if (numbers[i]==other.numbers[i+diff])
					count++;
				else count =0;
			} }
		int [] commonSuffix = new int [count]; 
		for (int i =count-1;i!=-1;i--) {
			commonSuffix[count-1-i]=numbers [numbers.length-i-1];
		}
		return new Array(commonSuffix);
	}
	//The method will return the length of the longest array of the arrays represented.
	public int longestPrefixAndSuffix() {
		int count = 0;
		int i = 0; 
		for ( int j = numbers.length/2;j<numbers.length;j++) { 
			if (numbers[i] == numbers [j]) { 
				count ++; 
				i++; 
			}
			else 
				count = 0;
		}
		return count; 
	}
	//It will contain an array consisting of the organs of both arrays
	public Array uniteWith(Array other) { 
		int n= numbers.length+other.numbers.length;
		int [] uniteWith = new int [n];
		for (int i = 0 ; i <numbers.length;i++) {
			uniteWith[i]=numbers[i];
		} 
		for (int j = numbers.length;j<n;j++) {
			uniteWith[j]=other.numbers[j-numbers.length]; 
		} 
		return new Array(uniteWith); 
	}
	// If the new array is in the old array 
	public static boolean isSub(int [] numbers, int[] numbersNew, int index){
		int j = 0;
		for(int i = index; i < numbers.length && j < numbersNew.length; i++){
			if(numbers[i] != numbersNew[j])
				return false;
			j++;
		}
		return true;
	}
	// It returns only if the organs of this array appear in the same order and sequence in this array
	public void removeSub(Array other) {
		if(other.numbers.length > numbers.length)
			return;

		for(int i = 0; i <= numbers.length - other.numbers.length; i++){
			if(isSub(numbers,other.numbers,i)){
				int [] newArray = new int[numbers.length - other.numbers.length];
				int j = 0;
				for(int idx = 0; idx < numbers.length; idx++){
					if(idx < i || idx >= i + other.numbers.length){
						newArray[j] = numbers[idx];
						j++;
					}
				}
				numbers = newArray;
				for(int k = 0; k < newArray.length; k++){
					System.out.print(newArray[k]);
				}
			}
		}}
	//The method will return the array organs as a string
	public String toString() { 
		String s ="{"; for (int i = 0 ;i<numbers.length-1;i++) {
			s= s+numbers[i]+", ";
		}
		s=s+numbers[numbers.length-1];
		s = s+"}";
		return s; 
	}
}