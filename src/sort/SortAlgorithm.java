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
	 * 快速排序
	 * 
	 * @param array
	 */
	public void fastSort(int[] array){
		
	}
	
	/**
	 * 选择排序
	 * 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，
	 * 存放在序列的起始位置，直到全部待排序的数据元素排完
	 * @param array
	 */
	public void selectedSort(int[] array){
		for(int i = 0; i < array.length - 1; i++){//循环长度-1次
			int min = array[i];//首次默认第一个数为最小
			int index = i;
			for(int j = i + 1; j < array.length; j++){//遍历接下来的所有数据，若比min小则记录这个数的下标
				if(min > array[j]){
					min = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = min;
			System.out.println("第" + i + "次比较后的数据：" + Arrays.toString(array));
		}
	}
	
	/**
	 * 冒泡排序
	 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
	 * 针对所有的元素重复以上的步骤，除了最后一个。
	 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 * @param array
	 */
	public void bubbleSort(int[] array){
		for(int i = 1; i < array.length; i++){//外层循环控制循环次数,共循环长度 - 1 次
			for(int j = 0; j < array.length - i; j++){
				if(array[j] > array[j + 1]){//前一个比后一大大，则交换位置,即把大的数沉下去
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
		sa.selectedSort(array);
	}
}
