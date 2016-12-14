package sort;

/**
 * 快速排序算法
 * 一趟快速排序的算法是：
 * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
 * 2）以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
 * 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]互换；
 * 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]互换；
 * 5）重复第3、4步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。
 * 找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）。
 * @author 钱多多--董书广
 * @since
 */
public class FastSort {
	
	public int getMiddle(int[] list, int low, int high){
        int tmp = list[low];//数组的第一个作为中轴
        while (low < high) {
            while (low < high && list[high] > tmp) {
                high--;
            }
            list[low] = list[high];//比中轴小的记录移到低端
            while (low < high && list[low] < tmp) {
                low++;
            }
            list[high] = list[low];//比中轴大的记录移到高端
        }
        list[low] = tmp;//中轴记录到尾
        return low;//返回中轴的位置
	}
	
	public void _quickSort(int[] list, int low, int high) {
        if(low < high){
            int middle = getMiddle(list, low, high);//将list数组进行一分为二
            _quickSort(list, low, middle - 1);//对低字表进行递归排序
            _quickSort(list, middle + 1, high);//对高字表进行递归排序
        }
    }
	
	public void quick(int[] str) {
        if (str.length > 0) {//查看数组是否为空
            _quickSort(str, 0, str.length - 1);
        }  
    }  
}
