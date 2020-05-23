package com.demo.bean;

public class Word {
	private int id;
	private String word;

	public Word(int id, String word) {
		super();
		this.id = id;
		this.word = word;
	}
	//一定要写上无参构造，这样返回数据时，C3P0就不会报错了
	public Word() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
