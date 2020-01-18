package com.learn.pattern.factorymethod;

public class MainTest {
	public static void main(String[] args) {
		FruitFactory appleFactory = new AppleFactory();
		Fruit apple = appleFactory.getFruit();
		apple.getFruit();
		
		FruitFactory bananaFactory = new BananaFactory();
		Fruit banana = bananaFactory.getFruit();
		banana.getFruit();
	}
}
