package MyAlgorithm;

// ��Ŀ����������һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��

public class The_number_of_1_in_the_binary {
	public static void main(String args[]){
		binaryToDecimal(8);
		
		// ����API����
		String result = Integer.toBinaryString(8);
		System.out.println(result);
	}
	
	// ��λ�����������λ�����������λ����31λ�����������λ����λ��Ϊ�㣬ʹ��&���õ����λ����
	// >>>���߼���λ����������nλ����λ��0
	// >>��������λ����������nλ��������λ��0�� ������λ��1
	// <<����λ����������nλ����λ��0
	public static void binaryToDecimal(int n){
		for(int i=31; i>=0; i--){
			System.out.print(n>>>i & 1);
		}
		System.out.println();
	}
}
