package com.learn.pattern.strategy;

public enum StrategyEnums {

	MD5("MD5算法"){
		@Override
		public Class<?> getStrategyClass() {
			return MD5Strategy.class;
		}
	},AES("AES算法"){
		@Override
		public Class<?> getStrategyClass() {
			return AESStrategy.class;
		}	
	};
	
	public abstract Class<?> getStrategyClass();
	
	private String className;
	
	StrategyEnums(){}
	
	StrategyEnums(String className){
		this.className= className;
	}
	
	public String getClassName(){
		return className;
	}
}
