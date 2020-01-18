package com.learn.pattern.strategy;

public class Context {
	private Strategy strategy;
	
	public Context(StrategyEnums enums) {
		try {
			this.strategy = (Strategy) enums.getStrategyClass().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void encrypt(){
		this.strategy.encrypt();
	}
}
