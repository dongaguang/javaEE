package spring.service.impl;

import spring.service.Poem;

/**
 * Performer的第二个实现类
 * @author 钱多多--董书广
 * @since
 */
public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	@Override
	public void perform() throws Exception {
		super.perform();
		System.out.println("read poem");
		poem.recite();
	}
	
}
