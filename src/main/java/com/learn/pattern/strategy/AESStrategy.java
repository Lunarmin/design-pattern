package com.learn.pattern.strategy;

public class AESStrategy implements Strategy{

	@Override
	public void encrypt() {
		System.out.println("ִAES加密");
	}

}
