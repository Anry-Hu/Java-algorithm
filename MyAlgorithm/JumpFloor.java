package MyAlgorithm;

// ��Ŀ������һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������

// ����˼·������Ҫ��������֣�ֱ�ӵ��õݹ麯������

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