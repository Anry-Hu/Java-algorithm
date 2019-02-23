package MyAlgorithm;

// 题目描述
// 在一个二维数组中（每个一维数组的长度相同），
// 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

// 解题思路
// 一个数，右边和下边都比自身大，利用这个规律可以简化程序
// 每次从左上角的数开始，向下边和右边进行扩散，再跳到右下角的点
// 边界也是可以简化的，因为右边、下边是最大的，如果还没走到那里大小就不够了，就不需要再去判断边界的点，这样可以节省时间

public class Lookup_in_a_two__dimensional_array {
	public static void main(String args[]){
		Lookup_in_a_two__dimensional_array demo = new Lookup_in_a_two__dimensional_array();
		int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}}; // 样例
		System.out.println(demo.Find(16, array));
	}
	
	public boolean Find(int target, int [][] array){
		int row = 0;
        int col = 0;
        int rowBound = array.length; // 储存边界
        int colBound = array[0].length; // 储存边界
        while(row < rowBound && col < colBound){
            if(array[row][col] > target){ // 如果目标比左上角的点小，可以判断返回false
                return false;
            }
            for(int i=row; i<rowBound; i++){ // 往下发散比较
                if(array[i][col] == target){
                    return true;
                }
                else if(array[i][col] > target){
                    rowBound = i; // 简化边界
                    break;               
                }
            }
            for(int j=col; j<colBound; j++){ // 往右发散比较
                if(array[row][j] == target){
                    return true;
                }
                else if(array[row][j] > target){
                    colBound = j; // 简化边界
                    break;
                }
            }
            if(row < rowBound && col < colBound){ // 判断是否走到头了
                row += 1;
                col += 1;
            }
            else if(row < rowBound && col == colBound){
                row += 1;
            }
            else if(row == rowBound && col < colBound){
                col += 1;
            }
        }
        return false; // 遍历完了也没有正确数据，则可以返回false
	}
}
