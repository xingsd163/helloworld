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
			System.out.println("��ѡ����: 1.��ʾȫ����¼  2.��ѯ��¼��¼  0.�˳�");
			command = scanner.nextInt();
			switch(command){
			case 1:
				System.out.println("��ʾȫ����¼");
				break;
			case 2:
				System.out.println("��ѯ��¼��¼");
				break;
			case 0:
				System.out.println("��ӭʹ�ã�");
				break;
			default:
				System.out.println("ѡ������������ѡ��");
			}
				
		}

	}

}
