package MyAlgorithm;

import java.util.*;

public class The_sum_of_path_values_of_the_binary_tree {
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(1);
		TreeNode root3 = new TreeNode(1);
		
		root.left = root1;
		root.right = root2;
		root2.left = root3;
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        int sum = 0;
        findPath(root, 3, arr, a1, sum);
        
        System.out.println(arr);
	}
	
	public static void findPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> a1, int sum){
		if(root == null){
			return;
		}
		sum += root.val;
		
		if(root.left==null && root.right==null){
			if(sum == target){
				a1.add(root.val);
				arr.add(new ArrayList<Integer>(a1)); // 一定要这么写，不能直接add(a1)
				a1.remove(a1.size()-1);
			}
			return;
		}
		
		a1.add(root.val);
		findPath(root.left,target,arr,a1,sum);
        findPath(root.right,target,arr,a1,sum);

        a1.remove(a1.size()-1);
	}
}
