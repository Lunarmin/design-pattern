package com.learn.pattern.abstractfactory;

public class WenshiFruitFactory implements FruitFactory {

	public Fruit getApple() {
		return new WenshiApple();
	}

	public Fruit getBanana() {
		return new WenshiBanana();
	}

}
