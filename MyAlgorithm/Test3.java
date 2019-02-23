package MyAlgorithm;

import java.util.*;

public class Test3 {
	public static void main(String args[]){	
		// System.out.println(Pattern.matches("a*", "aaab"));	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		test(arr);
		
		System.out.println(arr);
	}
	
	public static void test(ArrayList<Integer> arr){
		int i;
		for(i=0; i<arr.size(); i++);
		arr.remove(i-1);
		arr.add(2);
	}
}
