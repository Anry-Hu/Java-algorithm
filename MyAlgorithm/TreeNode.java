package MyAlgorithm;

import java.util.*;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
		left = null;
		right = null;
	}
	
	// 从上到下，从左往右打印二叉树
	public void printByList(TreeNode root){
		ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
		if(root == null){
			return;
		}
		arr.add(root);
		for(int i=0; i<arr.size(); i++){ // 这步很关键，因为一直往链表里面塞东西，所以长度一直在增加
			TreeNode node = arr.get(i);
			System.out.print(node.val + " ");
			if(node.left != null){
				arr.add(node.left);
			}
			if(node.right != null){
				arr.add(node.right);
			}
		}
	}
	
	// 分层打印二叉树
	public void printLayer(TreeNode root){
		ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
		if(root == null){
			return;
		}
		arr.add(root);
		TreeNode last = root; // 本行最后一个元素，碰到的时候输出需要换行
		TreeNode nlast = root; // 下一行最后一个元素
		for(int i=0; i<arr.size(); i++){
			TreeNode node = arr.get(i);		
			if(node.left != null){
				arr.add(node.left);
				nlast = node.left;
			}
			if(node.right != null){
				arr.add(node.right);
				nlast = node.right;
			}
			if(node == last){
				System.out.println(node.val);
				last = nlast;
			}
			else{
				System.out.print(node.val + " ");
			}
		}
	}
	
	public static void main(String args[]){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t2.left = t3;
		t1.right = t4;
		t3.left = t5;
		
		t1.printLayer(t1);
	}
}
