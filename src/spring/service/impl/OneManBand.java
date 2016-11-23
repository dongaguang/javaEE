package spring.service.impl;

import java.util.List;

import spring.service.Instrument;
import spring.service.Performer;

/**
 * 装配集合
 * 使用List或者Set方式
 * @author 钱多多--董书广
 * @since
 */
public class OneManBand implements Performer {
	private List<Instrument> instruments;

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws Exception {
		for(Instrument im: instruments){
			im.play();
		}
	}

}
