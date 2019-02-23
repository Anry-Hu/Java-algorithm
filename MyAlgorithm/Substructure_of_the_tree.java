package MyAlgorithm;

// 题目描述：输入两棵二叉树A，B，判断B是不是A的子结构。（PS：我们约定空树不是任意一个树的子结构）

// 解题思路：先制作一个函数，对两棵树的特点进行比较
// 接着遍历A树的点，即可

public class Substructure_of_the_tree {
	public static void main(String args[]){
		// 创建树的过程
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
	
	public static boolean compareTree(TreeNode t1, TreeNode t2){ // 当某一点相同时，开始比较
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
			else{ // 这一步很重要，如果没有返回正确值，需要再次进行判断
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
