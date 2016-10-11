package FileOperations;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * FileFilter 是对操作文件的过滤，有条件的列出文件
	 * file.listFile(filefilter)
	 * file.listFile()
	 * listFiles()方法会将dir中每个文件交给accept()方法检测，如果返回true，就作为方法的返回结果元素
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\FileTest");
		if(!file.exists()){
			System.out.println("目录不存在！");
			System.out.println("准备创建目录...");
			file.mkdirs();
		if(file.exists()){
			System.out.println("已成功创建目录：" + file.getCanonicalPath());
		}
		}
		
		if(file.exists()){
			System.out.println("目录已存在！");
		}
		
		
		//创建子目录
		File file2 = new File(file,"demo.txt");
		if(!file2.exists()){
			file2.createNewFile();
		}
		
		File[] files = file.listFiles();
		System.out.println(Arrays.toString(files));
		
		//利用 FileFilter类列出 .java 文件
		//回调模式
		
		
		File[] files2 = file.listFiles(new FileFilter(){
			
			public boolean accept(File afile){
				
				
				return afile.getName().endsWith(".java") && afile.isFile();
				
			}
			
			
		});
		
		System.out.println("Java文件列表：");
		for(File f:files2){
			System.out.println(f.getName());
		}
		
		
		//仅列出目录
		
		
		File[] files3 = file.listFiles(new FileFilter(){
			
			public boolean accept(File afile){
				
				
				return afile.isDirectory();
				
			}
			
			
		});
		
		
		System.out.println("列出目录");
		for(File f:files3){
			System.out.println(f.getName());
		}
		
		
	}

}
