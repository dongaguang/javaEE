package spring.service.impl;

import java.util.Map;

import spring.service.Instrument;
import spring.service.Performer;

/**
 * 装配集合
 * 使用Maps装配集合bean
 * @author 钱多多--董书广
 * @since
 */
public class OneManBandByMap implements Performer {
	private Map<String,Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws Exception {
		for (String key: instruments.keySet()) {
			System.out.println("key:" + key);
			Instrument im = instruments.get(key);
			im.play();
		}
	}

}
