package MyAlgorithm;

import java.util.*;

// ��Ŀ����������һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList

// ����˼·��������ʱ����һ�����������ݼ���

public class Print_the_list_from_tail_to_head {
	public static void main(String args[]){
		ListNode listNode = new ListNode(0);
		
		ArrayList<Integer> la = new ArrayList<Integer>(); // ���ʹ���������������ݣ������鴢����ܻ����
        ArrayList<Integer> lb = new ArrayList<Integer>();
        while(listNode != null){
            la.add(listNode.val); // ע������û��->����
            listNode = listNode.next;
        }
        for(int i=la.size()-1; i>=0; i--){ // size()��ʹ��
            lb.add(la.get(i)); // get()��ʹ��
        }
	}
}
