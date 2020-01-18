package com.learn.pattern.bridge.eg3;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("Jeep:");
		this.getEngine().installEngine();
	}

}
