package com.learn.pattern.builder;

public class HouseDirector {	
	
	public void makeHouse(HouseBuilder builder) {
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
	
}
