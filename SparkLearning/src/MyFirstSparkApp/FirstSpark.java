package MyFirstSparkApp;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

public class FirstSpark {

	public static void main(String[] args) {

		// YARN 模式下该文件位于HDFS下，例如 hdfs://192.168.0.126:9000/tmp/README.md
		String logFile = "/tmp/README.md"; //
		// 此处也可以不指定setMaster()，可以在 spark-submit 中通过 --Master 指定
		SparkConf conf = new SparkConf().setAppName("Simple Application");
		JavaSparkContext sc = new JavaSparkContext(conf);
		JavaRDD<String> logData = sc.textFile(logFile).cache();

		long numAs = logData.filter(new Function<String, Boolean>() {
			public Boolean call(String s) {
				return s.contains("a");
			}
		}).count();

		long numBs = logData.filter(new Function<String, Boolean>() {
			public Boolean call(String s) {
				return s.contains("b");
			}
		}).count();

		System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);
		System.out.println("");
	}
}
