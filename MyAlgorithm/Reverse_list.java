package MyAlgorithm;

import java.util.*;

// ��Ŀ����������һ��������ת��������������ı�ͷ��

// ����˼·���������鴢�����ݣ���Ҫ�ö�ջ����ջ�ٶ���

public class Reverse_list {
	public static void main(String args[]){
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		
        ArrayList<ListNode> arrList = new ArrayList<ListNode>();
        
        while(head1 != null){
            ListNode ls = new ListNode(0);
            ls.val = head1.val; // ��һ���ܹؼ���һ��Ҫ��˸�ֵ��ֱ�ӵ��ڻᱨ��
            arrList.add(ls);
            head1 = head1.next;
        }
        
        for(int i=arrList.size()-1; i>0; i--){
        	arrList.get(i).next = arrList.get(i-1);
        	System.out.println(arrList.get(i).val);
        }
	}
}
