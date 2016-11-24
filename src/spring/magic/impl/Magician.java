package spring.magic.impl;

import spring.magic.MagicBox;
import spring.service.Performer;

public class Magician implements Performer {
	private String magicWords;
	private MagicBox magicBox;
	public String getMagicWords() {
		return magicWords;
	}
	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}
	public MagicBox getMagicBox() {
		return magicBox;
	}
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}
	@Override
	public void perform() throws Exception {
		System.out.println(magicWords);
		System.out.println("the magic box contains");
		System.out.println(magicBox.getContents());
	}

}
