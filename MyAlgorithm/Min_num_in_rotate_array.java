package MyAlgorithm;

// 题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
// 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 
// 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
// NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

// 解题思路：找出不递减的那个地方即可

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
