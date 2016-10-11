package FileOperations;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * FileFilter �ǶԲ����ļ��Ĺ��ˣ����������г��ļ�
	 * file.listFile(filefilter)
	 * file.listFile()
	 * listFiles()�����Ὣdir��ÿ���ļ�����accept()������⣬�������true������Ϊ�����ķ��ؽ��Ԫ��
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\FileTest");
		if(!file.exists()){
			System.out.println("Ŀ¼�����ڣ�");
			System.out.println("׼������Ŀ¼...");
			file.mkdirs();
		if(file.exists()){
			System.out.println("�ѳɹ�����Ŀ¼��" + file.getCanonicalPath());
		}
		}
		
		if(file.exists()){
			System.out.println("Ŀ¼�Ѵ��ڣ�");
		}
		
		
		//������Ŀ¼
		File file2 = new File(file,"demo.txt");
		if(!file2.exists()){
			file2.createNewFile();
		}
		
		File[] files = file.listFiles();
		System.out.println(Arrays.toString(files));
		
		//���� FileFilter���г� .java �ļ�
		//�ص�ģʽ
		
		
		File[] files2 = file.listFiles(new FileFilter(){
			
			public boolean accept(File afile){
				
				
				return afile.getName().endsWith(".java") && afile.isFile();
				
			}
			
			
		});
		
		System.out.println("Java�ļ��б�");
		for(File f:files2){
			System.out.println(f.getName());
		}
		
		
		//���г�Ŀ¼
		
		
		File[] files3 = file.listFiles(new FileFilter(){
			
			public boolean accept(File afile){
				
				
				return afile.isDirectory();
				
			}
			
			
		});
		
		
		System.out.println("�г�Ŀ¼");
		for(File f:files3){
			System.out.println(f.getName());
		}
		
		
	}

}
