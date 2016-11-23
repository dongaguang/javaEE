package spring.service.impl;

import spring.service.Poem;

public class Sonnet implements Poem {

	@Override
	public void recite() {
		System.out.println("read poem by poem interface");
	}

}
