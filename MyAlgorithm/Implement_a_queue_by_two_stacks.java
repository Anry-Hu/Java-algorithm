package MyAlgorithm;

import java.util.Stack;

// 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型

// 解题思路：一个栈用来临时储存数据

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
