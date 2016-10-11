package FileAndStream;

/**
 * 
 * @author Nathan
 * 
 * 流、文件、IO
 * 文件传输和网络编程
 * 
 * 相关的类和接口包括：
 * File
 * InputStream,OutputStream 类，基础类，抽象类
 * Reader,Writer 基础类，抽象类
 * FileInputStream,FileOutputStream 文件流
 * FileReader,FileWriter 文件流
 * DataInputStream,DataOutputStream 特殊流
 * ObjectInputStream,ObjectOutputStream, 对象序列化，反序列化
 * BufferedReader,Scanner
 * PrintWriter
 * InputStreamReader,OutputStreamWriter, 转换流
 * 
 * RandomAccessFile
 * 
 * BufferedInputStream,BufferedOutputStream, 缓冲流
 * BufferedReader, BufferedWriter 缓冲流
 * 
 * PipedInputStream, PipedOutputStream, 管道流
 * PipedReader,PipedWriter  管道流
 *
 * 
 * FilterInputStream,FilterOutputStream，过滤流
 * 
 *
 * 
 * 打印流
 * PrintStream
 * PrintWriter
 * 
 *
 * 通常，我们认为字节流的功能比字符流功能强大，因为计算机里所有的数据都是字节流的。
 * 而字节流可以处理所有的二进制文件。
 * 但问题是，如果使用字节流来处理文本文件，则需要使用合适的方式把这些字节转换为字符，这就增加了编程复杂度。
 * 
 * 
 * 通常基于以下规则：
 * 如果进行输入/输出的内容是文本内容，则应该考虑使用字符流，如果进行输入/输出的内容是二进制内容，则应该考虑使用字节流。
 * 
 * 
 * 
 * 通常把计算机的文件分为文本文件和二进制文件，所有能用记事本打开并看到其中字符内容的文件称为文本文件，反之称为二进制文件。
 * 但实质上，计算机里的所有文件都是二进制文件，文本文件只是二进制文件的一种特例。
 * 
 * 
 * 
 * 
 * 
 * I/O流还可以按照如下方式分类：
 * 
 * 字节流，Byte Streams handle I/O of raw binary data.
 * 字符流，Character Streams handle I/O of character data, automatically handling translation to and from the local character set.
 * 缓冲流，Buffered Streams optimize input and output by reducing the number of calls to the native API. 缓冲流通过减少对原生API的调用次数优化输入和输出
 * 扫描和格式化，Scanning and Formatting allows a program to read and write formatted text.
 * 命令行输入输出，I/O from the Command Line describes the Standard Streams and the Console object.
 * 数据流，Data Streams handle binary I/O of primitive data type and String values.
 * 对象流，Object Streams handle binary I/O of objects.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 *
 *
 */

public class FileStreamOverview {

}
