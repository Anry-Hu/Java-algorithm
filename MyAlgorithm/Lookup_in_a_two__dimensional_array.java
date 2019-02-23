package MyAlgorithm;

// ��Ŀ����
// ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
// ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
// �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������

// ����˼·
// һ�������ұߺ��±߶������������������ɿ��Լ򻯳���
// ÿ�δ����Ͻǵ�����ʼ�����±ߺ��ұ߽�����ɢ�����������½ǵĵ�
// �߽�Ҳ�ǿ��Լ򻯵ģ���Ϊ�ұߡ��±������ģ������û�ߵ������С�Ͳ����ˣ��Ͳ���Ҫ��ȥ�жϱ߽�ĵ㣬�������Խ�ʡʱ��

public class Lookup_in_a_two__dimensional_array {
	public static void main(String args[]){
		Lookup_in_a_two__dimensional_array demo = new Lookup_in_a_two__dimensional_array();
		int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}}; // ����
		System.out.println(demo.Find(16, array));
	}
	
	public boolean Find(int target, int [][] array){
		int row = 0;
        int col = 0;
        int rowBound = array.length; // ����߽�
        int colBound = array[0].length; // ����߽�
        while(row < rowBound && col < colBound){
            if(array[row][col] > target){ // ���Ŀ������Ͻǵĵ�С�������жϷ���false
                return false;
            }
            for(int i=row; i<rowBound; i++){ // ���·�ɢ�Ƚ�
                if(array[i][col] == target){
                    return true;
                }
                else if(array[i][col] > target){
                    rowBound = i; // �򻯱߽�
                    break;               
                }
            }
            for(int j=col; j<colBound; j++){ // ���ҷ�ɢ�Ƚ�
                if(array[row][j] == target){
                    return true;
                }
                else if(array[row][j] > target){
                    colBound = j; // �򻯱߽�
                    break;
                }
            }
            if(row < rowBound && col < colBound){ // �ж��Ƿ��ߵ�ͷ��
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
        return false; // ��������Ҳû����ȷ���ݣ�����Է���false
	}
}
