package com.learn.pattern.testfactory;

public class AddOperationFactory implements OperationFactory{

	public Operation getOperation() {
		return new AddOperation();
	}
	
}
