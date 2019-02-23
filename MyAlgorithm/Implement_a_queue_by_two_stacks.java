package MyAlgorithm;

import java.util.Stack;

// ��Ŀ������������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint����

// ����˼·��һ��ջ������ʱ��������

public class Implement_a_queue_by_two_stacks {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void push(int node){
		while(!stack1.empty()){
			stack2.push(stack1.pop());
		}
		stack1.push(node);
		while(!stack2.empty()){
			stack1.push(stack2.pop());
		}
	}
	
	public static int pop(){
		return stack1.pop();
	}
}
