package FileInputOutputOperations;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	/**
	 * @author Nathan
	 * ����Fileʵ����δ���������ļ����ļ��У���Ҫʹ�� mkdirs() �� createNewFile()��������
	 */
	public static void main(String[] args) {
		
		
		try {
			File f1 = new File("helloworld");
			System.out.println(f1.getCanonicalPath());
			//����ʵ����δ�����Ĵ�������
			
			if(f1.exists()){
				System.out.println("f1�Ѵ��ڣ�����ɾ��...");
				f1.delete();
			}
			
			if(f1.isDirectory()){
				System.out.println("��Ŀ¼");
			}
			
			if(f1.isFile()){
				System.out.println("���ļ�");
			}
			
			
			f1.mkdirs();
			
			if(f1.exists()){
				System.out.println("�����ɹ���");
			}
			
			if(f1.isDirectory()){
				System.out.println("��Ŀ¼");
			}
			
			File f2 = new File("helloworld2");
			f2.createNewFile();
			
			if(f2.exists()){
				System.out.println("f2�����ɹ�");
			}
			System.out.println(f2.lastModified());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
