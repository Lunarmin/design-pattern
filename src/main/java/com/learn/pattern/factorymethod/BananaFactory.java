package com.learn.pattern.factorymethod;

public class BananaFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		return new Banana();
	}

}
