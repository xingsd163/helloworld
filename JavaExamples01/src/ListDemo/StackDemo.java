package ListDemo;

import java.util.Stack;

/**
 * 
 * @author Nathan
 * 
 * Stack 类是 Vector 的子类，
 * 栈，是一种后进先出(LIFO)的容器，最后push进栈的元素，最先出栈
 * 
 * peek() 返回栈的第一个元素栈，但并不将该元素出栈
 * push() 将一个元素push进栈
 * pop() 返回栈的第一个元素并将该元素出栈
 *
 */

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		s.push(new String("第一个元素"));
		s.push(new String("第二个元素"));
		s.push(new String("第三个元素"));
		
		System.out.println(s);
		
		System.out.println("当前栈顶元素是："+s.peek());
		
		System.out.println("弹出当前栈顶元素："+ s.pop()+";"+"之后栈顶元素变成成了："+ s.peek());
		
		s.push("第四个元素");
		System.out.println(s.peek());
		System.out.println("当前栈的大小是："+s.size());
		
		if(s.size()>0){
			System.err.println("当前的栈大小是："+s.size());
		}
		
		
	}

}
