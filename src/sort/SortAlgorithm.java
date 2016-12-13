package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 各种常用排序算法的实现
 * @author 钱多多--董书广
 * @since
 */
public class SortAlgorithm {
	
	/**
	 * 冒泡排序
	 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
	 * 针对所有的元素重复以上的步骤，除了最后一个。
	 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 * @param array
	 */
	public void bubbleSort(int[] array){
		for(int i = 1; i < array.length; i++){//外层循环控制循环次数
//			System.out.println("第" + i + "次比较前的数据：" + Arrays.toString(array));
			for(int j = 0; j < array.length - i; j++){
				if(array[j] > array[j + 1]){//前一个比后一大大，则交换位置
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			System.out.println("第" + i + "次比较后的数据：" + Arrays.toString(array));
		}
	}
	
	public static void main(String[] args) {
		SortAlgorithm sa = new SortAlgorithm();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			Random rm = new Random();
			array[i] = rm.nextInt(99);
		}
		System.out.println("           排序前的数组：" + Arrays.toString(array));
		sa.bubbleSort(array);
	}
}
