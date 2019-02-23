package MyAlgorithm;

// 题目描述：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

public class The_number_of_1_in_the_binary {
	public static void main(String args[]){
		binaryToDecimal(8);
		
		// 调用API函数
		String result = Integer.toBinaryString(8);
		System.out.println(result);
	}
	
	// 移位操作：将最高位的数移至最低位（移31位），除过最低位其余位置为零，使用&，得到最高位数字
	// >>>：逻辑移位符，向右移n位，高位补0
	// >>：算数移位符，向右移n位，正数高位补0， 负数高位补1
	// <<：移位符，向左移n位，低位补0
	public static void binaryToDecimal(int n){
		for(int i=31; i>=0; i--){
			System.out.print(n>>>i & 1);
		}
		System.out.println();
	}
}
