package MyAlgorithm;

// 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

// 解题思路：不需要额外的数字，直接调用递归函数即可

public class JumpFloor {
	public static void main(String args[]){
		System.out.println(jump(3));
	}
	
	public static int jump(int target){
		if(target==1 || target==0){
			return 1;
		}
		else if(target==2){
			return 2;
		}
		else{
			int res = 0;
			for(int i=0; i<target; i++){
				res += jump(i);
			}
			return res;
		}
	}
}