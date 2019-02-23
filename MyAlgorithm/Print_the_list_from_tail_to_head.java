package MyAlgorithm;

import java.util.*;

// 题目描述：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList

// 解题思路：遍历的时候用一个链表储存数据即可

public class Print_the_list_from_tail_to_head {
	public static void main(String args[]){
		ListNode listNode = new ListNode(0);
		
		ArrayList<Integer> la = new ArrayList<Integer>(); // 最好使用链表来储存数据，用数组储存可能会出错
        ArrayList<Integer> lb = new ArrayList<Integer>();
        while(listNode != null){
            la.add(listNode.val); // 注意这里没有->符号
            listNode = listNode.next;
        }
        for(int i=la.size()-1; i>=0; i--){ // size()的使用
            lb.add(la.get(i)); // get()的使用
        }
	}
}
