package com.learn.pattern.simplefactory;

public class FruitFactory {
	
	public static Fruit getFruit(Class<?> type) throws InstantiationException, IllegalAccessException{
		return (Fruit) type.newInstance();
	}
}
