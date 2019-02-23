package MyAlgorithm;

import java.util.*;

public class String_sorting {
	public static void main(String args[]){
		ArrayList<String> result = new ArrayList<String>();
		String str = "abb";
		arrange(str.toCharArray(), 0, result);
		System.out.println(result);
	}
	
	public static void arrange(char[] cr, int begin, ArrayList<String> str){
		// if(cr==null || cr.length==0 || begin<0 || begin>cr.length-1) { return ; }
		
		if(begin == cr.length-1){
			System.out.println(cr);
			str.add(String.valueOf(cr));
		}
		else{
			for(int i=begin; i<cr.length; i++){
				System.out.println("i:" + i);
				if(isSwap(cr, begin, i)){
					swap(cr, i, begin);
					arrange(cr, begin+1, str);
					swap(cr, i, begin);
				}
			}
		}
	}
	
	public static void swap(char[] x, int a, int b){
		char t = x[a];
		x[a] = x[b];
		x[b] = t;
	}
	
	public static boolean isSwap(char[] x, int a, int b){
		for(int i=a; i<b; i++){
			if(x[i] == x[b]){
				return false;
			}
		}
		return true;
	}
}
