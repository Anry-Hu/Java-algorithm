package MyAlgorithm;

// 题目描述：操作给定的二叉树，将其变换为源二叉树的镜像。

// 解题思路：递归方法，画张图即可，可以直接使用，不要被迷惑了

public class Mirror_of_the_binary_tree {
	public static void main(String args[]){
		TreeNode t1 = new TreeNode(8);
		TreeNode t2 = new TreeNode(6);
		TreeNode t3 = new TreeNode(10);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(9);
		TreeNode t7 = new TreeNode(11);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		
		t1.printLayer(t1);
		Mirror(t1);
		t1.printLayer(t1);
	}
	
	public static void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }
    }
}
