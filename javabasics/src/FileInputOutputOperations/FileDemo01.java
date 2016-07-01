package FileInputOutputOperations;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	/**
	 * @author Nathan
	 * 创建File实例后并未真正创建文件或文件夹，需要使用 mkdirs() 或 createNewFile()来创建。
	 */
	public static void main(String[] args) {
		
		
		try {
			File f1 = new File("helloworld");
			System.out.println(f1.getCanonicalPath());
			//创建实例后并未真正的创建对象
			
			if(f1.exists()){
				System.out.println("f1已存在，正在删除...");
				f1.delete();
			}
			
			if(f1.isDirectory()){
				System.out.println("是目录");
			}
			
			if(f1.isFile()){
				System.out.println("是文件");
			}
			
			
			f1.mkdirs();
			
			if(f1.exists()){
				System.out.println("创建成功！");
			}
			
			if(f1.isDirectory()){
				System.out.println("是目录");
			}
			
			File f2 = new File("helloworld2");
			f2.createNewFile();
			
			if(f2.exists()){
				System.out.println("f2创建成功");
			}
			System.out.println(f2.lastModified());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
