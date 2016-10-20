package SystemAndRuntime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingTest {
	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			Process p = Runtime.getRuntime().exec("ping www.baidu.com");
			br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
			String line = null;
			StringBuffer sb = new StringBuffer();
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}