package com.learn.pattern.simplefactory;

public class MainTest {
	public static void main(String[] args) {
		try {
			Fruit apple = FruitFactory.getFruit(Apple.class);
			apple.getFruit();
			Fruit banana = FruitFactory.getFruit(Banana.class);
			banana.getFruit();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
