package javase;

import java.util.*;

public class commandparsing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int command=0;
		while(true){
			System.out.println("请选择功能: 1.显示全部记录  2.查询登录记录  0.退出");
			command = scanner.nextInt();
			switch(command){
			case 1:
				System.out.println("显示全部记录");
				break;
			case 2:
				System.out.println("查询登录记录");
				break;
			case 0:
				System.out.println("欢迎使用！");
				break;
			default:
				System.out.println("选择有误，请重新选择！");
			}
				
		}

	}

}
