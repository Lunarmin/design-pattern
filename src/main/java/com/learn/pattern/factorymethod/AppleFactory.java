package com.learn.pattern.factorymethod;

public class AppleFactory implements FruitFactory{

	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
