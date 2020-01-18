package com.learn.pattern.strategy;

public class MainTest {

	public static void main(String[] args) {
		Context context = new Context(StrategyEnums.AES);
		context.encrypt();
	}
}
