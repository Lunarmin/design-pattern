package com.learn.pattern.visitor;

/*
 * 公园的B部分
 */
public class ParkB implements ParkElement{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
