package com.learn.lsp;

public class MainClass {
	public static void main(String[] args) {
		fly(new Laoying());
	}
	
	public static void fly(Bird bird) {
		bird.fly();
	}
}
