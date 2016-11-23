package spring.service.impl;

import spring.service.Instrument;

/**
 * 通过setter()方法实现依赖注入
 * @author 钱多多--董书广
 * @since
 */
public class SaxoPhone implements Instrument {

	@Override
	public void play() {
		System.out.println("通过setter()方法实现依赖注入bean");
	}

}
