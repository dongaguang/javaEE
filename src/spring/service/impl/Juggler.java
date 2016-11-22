package spring.service.impl;

import spring.service.Performer;

/**
 * Performer的第一个实现类
 * @author 钱多多--董书广
 * @since
 */
public class Juggler implements Performer {
	private int beanBags = 3;
	
	public Juggler(){
		
	}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws Exception {
		System.out.println("JUGGLING" + beanBags + "BEANBAGS");
	}

}
