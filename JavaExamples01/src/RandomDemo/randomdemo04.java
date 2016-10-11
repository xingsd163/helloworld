package RandomDemo;

/**
 * 
 * @author Nathan
 * 回顾数组、字符串、StringBuilder
 *
 */

public class randomdemo04 {
	
	public static void main(String[] args) {
		
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
		
		System.out.print("英雄联盟共包括以下大区：");
		/*for(int i=0;i<names.length;i++){
			System.out.print(names[i]+",");
		}*/
		//输出为：英雄联盟共包括以下大区：德玛西亚,诺克萨斯,战争学院,皮城警备,艾欧尼亚,怒瑞玛,班德尔城,皮尔特沃夫,黑色玫瑰,暗影岛,钢铁烈阳,暗影岛,无畏先锋,扭曲丛林,征服之海,弗雷尔卓德,
		//此种输出方式的缺点是最少包含一个逗号，应该去掉
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			
			sb.append(names[i]+",");
			
		}
		
		//删除最后的逗号
		sb.deleteCharAt(sb.length()-1);
		
		System.out.print(sb);
		
		
	}
	
	

}
