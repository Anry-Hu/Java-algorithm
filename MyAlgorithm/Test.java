package MyAlgorithm;

import java.util.*;

public class Test {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int x = 0;
		int f = 0;
		int d =0;
		int p = 0;
		x = in.nextInt();
		f = in.nextInt();
		d = in.nextInt();
		p = in.nextInt();
		int res1 = 0;
		int res2 = 0;
		res1 = f;
		res2 = d / x;
		if(res1 >= res2){
			System.out.println(res2);
		}
		else{
			System.out.println(res1 + ((res2-res1)*x+d%x)/(p+x));
		}
	}
}