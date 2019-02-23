package MyAlgorithm;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num = 0;
		num = in.nextInt();
		int n = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i=0; i<num; i++){
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			int res1 = b / 3;
			int res2 = c / 2;
			if(n*6 > a+b*2+c*3){
				System.out.println("No");
			}
			else if(n <= res1 + res2){
				System.out.println("Yes");
			}
			else{
				n = n - res1 - res2;
				if(b%3 == 0 && c%2 == 0){
					if((n - a/6) >= 0){
						System.out.println("Yes");
					}
					else{
						System.out.println("No");
					}
				}
				else if(b%3 == 0 && c%2 == 1){
					if(a < 3){
						System.out.println("No");
					}
					else{
						if((n - (a-3)/6 - 1) >= 0){
							System.out.println("Yes");
						}
						else{
							System.out.println("No");
						}
					}
				}
				else if(b%3 == 1 && c%2 == 0){
					if(a < 4){
						System.out.println("No");
					}
					else{
						if((n - (a-4)/6 - 1) >= 0){
							System.out.println("Yes");
						}
						else{
							System.out.println("No");
						}
					}
				}
				else if(b%3 == 1 && c%2 == 1){
					if(a < 1){
						System.out.println("No");
					}
					else{
						if((n - (a-1)/6 - 1) >= 0){
							System.out.println("Yes");
						}
						else{
							System.out.println("No");
						}
					}
				}
				else if(b%3 == 2 && c%2 == 0){
					if(a < 2){
						System.out.println("No");
					}
					else{
						if((n - (a-2)/6 - 1) >= 0){
							System.out.println("Yes");
						}
						else{
							System.out.println("No");
						}
					}
				}
				else if(b%3 == 2 && c%2 == 1){
					if(a < 1){
						System.out.println("No");
					}
					else{
						if(a < 5){
							if((n-1) >= 0){
								System.out.println("Yes");
							}
							else{
								System.out.println("No");
							}
						}
						else{
							if((n - (a-5)/6 - 2) >= 0){
								System.out.println("Yes");
							}
							else{
								System.out.println("No");
							}
						}
					}
				}
			}
		}
	}
}
