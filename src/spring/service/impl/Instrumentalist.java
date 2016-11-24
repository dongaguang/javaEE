package spring.service.impl;

import spring.service.Instrument;
import spring.service.Performer;

/**
 * 通过setter()方法实现Spring的依赖注入(DI)
 * @author 钱多多--董书广
 * @since
 */
public abstract class Instrumentalist implements Performer {
	private String song;
	public void setSong(String song) {
		this.song = song;
	}
	/**
		1.通过setter()方法实现Spring的依赖注入(DI)
		public void setInstrument(Instrument instrument) {
			this.instrument = instrument;
		}
		@Override
		public void perform() throws Exception {
			System.out.println("playing" + song + ":");
			instrument.play();
		}
		 * 
	 */

	//2.使用方法注入
	public abstract Instrument getInstrument();
	@Override
	public void perform() throws Exception {
		System.out.println("playing" + song + ":");
		getInstrument().play();
	}
}
