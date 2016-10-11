package SystemAndRuntime;


/**
 * 
 * 查找出现次数最多的大区
 * 
 * 首先利用随机数生成大区列表，保存到 Arraylist 中，然后利用Collections.frequency() 分析每个出现的次数，然后将结果以key-value
 * 的形式保存到到HashMap中，同时完成去重。
 * 
 * Collections.frequency() 用于统计指定元素的出现次数
 * HashMap 中key是唯一的，可以用于去除重复值
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class RuntimeDemo02 extends Thread{
	
	public static void main(String[] args) {
		
		
		
		RuntimeDemo02 thread = new RuntimeDemo02();
		thread.start();
		
		long start1 = System.currentTimeMillis();
		
		String[] names = new String[16];
		names[0]="德玛西亚";
		names[1]="诺克萨斯";
		names[2]="战争学院";
		names[3]="皮城警备";
		names[4]="艾欧尼亚";
		names[5]="怒瑞玛";
		names[6]="班德尔城";
		names[7]="皮尔特沃夫";
		names[8]="黑色玫瑰";
		names[9]="暗影岛";
		names[10]="钢铁烈阳";
		names[11]="暗影岛";
		names[12]="无畏先锋";
		names[13]="扭曲丛林";
		names[14]="征服之海";
		names[15]="弗雷尔卓德";
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		//指定生成多少条记录
		int times=5000;
		
		for(int i=0;i<times;i++){
			//不包括16，即索引为0-15
			int num = new Random().nextInt(16);
			al.add(names[num]);
		}
		
		System.out.println("列表长度"+al.size());
	
		long end1 = System.currentTimeMillis();
		
		long duration1 = end1 - start1;
		
		System.out.println("数据生成耗时"+duration1+"毫秒");
		System.out.println("**************************");
		
		long start2 = System.currentTimeMillis();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
			
		for(int i=0;i<al.size();i++){
			
			int fres = Collections.frequency(al, (String)al.get(i));
			
			
			hm.put(fres, (String)al.get(i));
			
		}
		
		System.out.println(hm);
		
		int max = Collections.max(hm.keySet());
		
		//System.out.println(max);
		
		String lolregion = hm.get(max);
		
		System.out.println("出现次数最多的大区是【"+lolregion+"】，共出现了"+max+"次！");
		
		long end2 = System.currentTimeMillis();
		long duration2=end2-start2;
		
		System.out.println("分析统计耗时"+duration2+"毫秒");
		
		
		
	}

	@Override
	public void run() {
		
		while (true) {
            System.gc();// 强制虚拟机进行垃圾回收以释放内存
            int free = (int) Runtime.getRuntime().freeMemory() / 1024/1024;// 获得可用内存
            int total = (int) Runtime.getRuntime().totalMemory() / 1024/1024;// 获得总共内存
            int status = free * 100 / total;// 获得内存使用率
            System.out.println("可用内存：" + free + "MB"); // 显示可用内存
            System.out.println("总共内存：" + total + "MB"); // 显示总共内存    
            System.out.println("可用内存：" + status + "%");
            try {
                Thread.sleep(60000);// 线程休眠1秒钟进行动态更新
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
		
	}

