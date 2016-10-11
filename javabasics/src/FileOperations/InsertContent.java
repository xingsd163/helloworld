package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {

	/**
	 * @param args
	 * ���м�λ�ò������ݻḲ�ǵ����������
	 * �����Ҫ��ָ��λ�ò������ݣ�������Ҫ�ȰѲ�����������ݶ��뻺�������Ȱ���Ҫ���������д���ļ����ٽ�������������׷�ӵ��ļ�����
	 * 
	 * ��ʱ�ļ����� JVM �˳�ʱ��ɾ�������Ա��汻�����ļ��Ĳ���������ݡ������Ƚ��ļ��в���������ݶ�����ʱ�ļ��У�Ȼ�����¶�λ��
	 * ����㣬����Ҫ�����������ӵ��ļ����棬�����ʱ�ļ���������ӵ��ļ����档
	 * 
	 * ѧϰʹ����ʱ�ļ�
	 */
	
	public static void insert(String fileName,long pos, String insertContent) throws IOException{
		//����һ����ʱ�ļ������ڱ�������������
		File temp = File.createTempFile("temp", "tmp");
		temp.deleteOnExit();
		
		RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
		//�����ļ��������������
		FileInputStream tmpIn = new FileInputStream(temp);
		FileOutputStream tmpOut = new FileOutputStream(temp);
		
		raf.seek(pos);
		
		//��1��----������������ݶ�����ʱ�ļ��б���----
		
		//ÿ�ζ�ȡ���ֽ�����������������
		byte[] bbuf = new byte[64];
		//���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead = 0;
		
		//ʹ��ѭ����ʽ��ȡ�����������
		while((hasRead=raf.read(bbuf))>0){
			//����ȡ������д����ʱ�ļ�
			tmpOut.write(bbuf,0,hasRead);
		}
		
		//(2)----��������----
		//���ļ���¼ָ�����¶�λ��posλ��
		raf.seek(pos);
		raf.write(insertContent.getBytes("GBK"));
		
		//(3)׷����ʱ�ļ��е�����
		while((hasRead=tmpIn.read(bbuf))>0){
			raf.write(bbuf,0,hasRead);
		}
		
		
		
		
	}
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InsertContent.insert("D:\\FileTest\\randomaccessfile.txt",30,"[�������Ҫ��������ݣ��㿴����û��]");

	}

}
