package MyAlgorithm;

// ��Ŀ��������һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
// ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
// ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
// NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��

// ����˼·���ҳ����ݼ����Ǹ��ط�����

public class Min_num_in_rotate_array {
	public static void main(String args[]){
		int array[] = {3,4,5,1,2};
		
		if(array.length == 0){
			System.out.println(0);
		}
		else if(array.length == 1){
			System.out.println(array[0]);
		}
		else{
			int res = array[0];
			for(int i=1; i<array.length; i++){
				if(array[i-1] > array[i]){
					if(res > array[i]){
						res = array[i];
					}
					break;
				}
			}
			System.out.println(res);
		}
	}
}
