package MyAlgorithm;

// ��Ŀ�������������ö�����A��B���ж�B�ǲ���A���ӽṹ����PS������Լ��������������һ�������ӽṹ��

// ����˼·��������һ�������������������ص���бȽ�
// ���ű���A���ĵ㣬����

public class Substructure_of_the_tree {
	public static void main(String args[]){
		// �������Ĺ���
		TreeNode t1 = new TreeNode(8);
		TreeNode t11 = new TreeNode(8);
		TreeNode t12 = new TreeNode(9);
		TreeNode t13 = new TreeNode(2);
		
		TreeNode t2 = new TreeNode(8);
		TreeNode t21 = new TreeNode(9);
		TreeNode t22 = new TreeNode(2);
		
		t1.left = t11;
		t11.left = t12;
		t11.right = t13;
		
		t2.left = t21;
		t2.right = t22;
		
		System.out.println(compareTree(t1, t2));
	}
	
	public static boolean compareTree(TreeNode t1, TreeNode t2){ // ��ĳһ����ͬʱ����ʼ�Ƚ�
		if(t2==null){
			return true;
		}
		else if(t1==null){
			return false;
		}
		else if(t1.val == t2.val){
			boolean b1 = compareTree(t1.left, t2.left);
			boolean b2 = compareTree(t1.right, t2.right);
			if(b1 && b2){
				return true;
			}
			else{ // ��һ������Ҫ�����û�з�����ȷֵ����Ҫ�ٴν����ж�
				b1 = compareTree(t1.left, t2);
				b2 = compareTree(t1.right, t2);
				if(b1 || b2){
					return true;
				}
				else{
					return false;
				}
			}
		}
		else{
			boolean b1 = compareTree(t1.left, t2);
			boolean b2 = compareTree(t1.right, t2);
			if(b1 || b2){
				return true;
			}
			else{
				return false;
			}
		}
	}
}
