package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 常用的一些集合操作
 * @author Administrator
 *
 */
public class ListUtil {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(i + "");
		}
		//使用增强型for循环会报异常
		ListUtil.iteretorList3(list);
	}
	
	/**
	 * 使用迭代器遍历List并移出元素
	 * @param list
	 */
	public static void iteretorList1(List<String> list){
		Iterator<String> it = list.iterator();
		System.out.println(list);
		while(it.hasNext()){
			if("2".equals(it.next())){
				it.remove();
			}
		}
		System.out.println(list);
	}
	
	/**
	 * 使用迭代器遍历List并移出元素
	 * @param list
	 */
	public static void iteretorList2(List<String> list){
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if("2".equals(list.get(i))){
				list.remove(i);
				i--;//i--的目的是防止漏掉元素，list删除一个元素以后后面的元素会前进一个位置
			}
		}
		System.out.println(list);
	}
	
	/**
	 * 使用迭代器遍历List并移出元素
	 * @param list
	 */
	public static void iteretorList3(List<String> list){
		System.out.println(list);
		for(String str: list){
			if("2".equals(str)){
				list.remove(str);
				break;//这样删除之后不终止循环的话会报java.util.ConcurrentModificationException异常，终止循环则可以正常删除
			}
		}
		System.out.println(list);
	}
}
