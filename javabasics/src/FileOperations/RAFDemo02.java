package FileOperations;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RAFDemo02 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File demo = new File("D:\\FileTest\\randomaccessfile.txt");
		
		RandomAccessFile raf = new RandomAccessFile(demo,"rw");
		System.out.print("��ȡ��ʼ�α�λ�ã�");
		System.out.println(raf.getFilePointer());
		
		byte[] b1 = new byte[1];
		int r = raf.read(b1);
		//���ֽ�����ת��Ϊ�ַ���
		System.out.println(new String(b1));
		System.out.println(raf.getFilePointer());
		
		//׷������
		raf.seek(raf.length());
		raf.write("\r\n�����".getBytes("GBK"));
		//���м�λ�ò������ݻḲ�ǵ����������
		//�����Ҫ��ָ��λ�ò������ݣ�������Ҫ�ȰѲ�����������ݶ��뻺�������Ȱ���Ҫ���������д���ļ����ٽ�������������׷�ӵ��ļ�����
		raf.seek(3);
		raf.write("\r\n����������ƨ�����ҲŲ�ϡ���أ�".getBytes("GBK"));
	}

}
