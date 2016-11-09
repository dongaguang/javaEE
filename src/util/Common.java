package util;

/**
 * 常见的一些小算法问题
 * @author 董书广
 *
 */
public class Common {
	/**
	 * 斐波那契数列
	 * @param num
	 * @return
	 */
	private static int fibonacci(int num){
		int sum = 0;
		switch (num) {
		case 0:
			sum = 0;
			break;
		case 1:
			sum = 1;
			break;
		default:
			sum = fibonacci(num - 1) + fibonacci(num - 2);
			break;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("斐波那契数列的第" + i + "个的数是：" + Common.fibonacci(i));
		}
	}
}
