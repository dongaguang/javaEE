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
	 * 一趟快速排序的算法是：
	 * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
	 * 2）以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
	 * 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]互换；
	 * 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]互换；
	 * 5）重复第3、4步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。
	 * 找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）。
	 * @param array
	 */
	public void fastSort(int[] array){
		int left = 0;//从左到右遍历
		int right = array.length;//从右到左遍历
		int mid = array[left];//第一个关键数据
		for(left = 0; left < array.length; left++){
			if(){
				
			}
		}
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
