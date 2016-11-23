package spring.service.impl;

import spring.service.Instrument;
import spring.service.Performer;

/**
 * 通过setter()方法实现Spring的依赖注入(DI)
 * @author 钱多多--董书广
 * @since
 */
public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	public void setSong(String song) {
		this.song = song;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public void perform() throws Exception {
		System.out.println("playing" + song + ":");
		instrument.play();
	}

}
