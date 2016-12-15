package fkjava.nine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

/**
 * 测试Scanner接收用户来自键盘的输入
 * @author 钱多多--董书广
 * @since
 */
public class TestScanner {
	public static void main(String[] args) throws Exception {
		TestScanner ts = new TestScanner();
		ts.runtimeClass();
	}
	
	/**
	 * 获取java程序关联的运行时对象
	 * @throws Exception 
	 */
	public void runtimeClass() throws Exception{
		Runtime rt = Runtime.getRuntime();
		System.out.println("处理器数量：" + rt.availableProcessors());
		System.out.println("空闲内存数：" + rt.freeMemory());
		System.out.println("总内存数：" + rt.totalMemory());
		System.out.println("可用最大内存数：" + rt.maxMemory());
		rt.exec("calc.exe");
	}
	
	/**
	 * System类
	 */
	public void systemClass() throws Exception {
		
		//获取系统所有的环境变量
		Map<String,String> sys = System.getenv();
		//遍历所有的环境变量
		Iterator<Entry<String,String>> it = sys.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,String> entry = it.next();
			System.out.println("key:" + entry.getKey() + "--value:" + entry.getValue());
		}
		
		//遍历所有的环境变量另一种方式
		Iterator<String> key = sys.keySet().iterator();
		while(key.hasNext()){
			String k = key.next();
			System.out.println("key:" + k + "--value:" + sys.get(k));
		}
		
		//获取所有的系统属性
		Properties pro = System.getProperties();
		pro.store(new FileOutputStream("d://prop.txt"), "");
		
		//遍历所有的系统属性的key
		@SuppressWarnings("rawtypes")
		Enumeration eleK = pro.propertyNames();
		while(eleK.hasMoreElements()){
			System.out.println(eleK.nextElement());
		}
		
		//遍历所有的系统属性的value
		Enumeration<Object> eleV = pro.elements();
		while(eleV.hasMoreElements()){
			System.out.println(eleV.nextElement());
		}
		
		//遍历所有的系统属性
		Iterator<Entry<Object,Object>> pi = pro.entrySet().iterator();
		while(pi.hasNext()){
			@SuppressWarnings("rawtypes")
			Entry entry = (Entry)pi.next();
			System.out.println("key:" + entry.getKey() + "--value:" + entry.getValue());
		}

	}
	
	/**
	 * Scanner方法
	 * @throws Exception
	 */
	public void scannerMethod() throws Exception{
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()){
//			System.out.println(sc.next());
//		}
		Scanner scf = new Scanner(new File("d://www.txt"));
		scf.useDelimiter("\n");
		while(scf.hasNextLine()){
			System.out.println(scf.nextLine());
		}
	}
}
