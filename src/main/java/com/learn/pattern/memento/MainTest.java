package com.learn.pattern.memento;

/**
 * 备忘录模式
 * */
public class MainTest {

	public static void main(String[] args) {
		MementoCaretaker mementoCaretaker = new MementoCaretaker();
		Originator originator = new Originator();
		Originator2 originator2 = new Originator2();
		
		System.out.println("*****Originator*****");
		originator.testState1();
		mementoCaretaker.saveMemento("Originator", originator.createMemento());
		originator.showState();
		originator.testState2();
		originator.showState();
		originator.restoreMemento(mementoCaretaker.retrieveMemento("Originator"));
		originator.showState();
		
		System.out.println("*****Originator2*****");
		originator2.testState1();
		mementoCaretaker.saveMemento("Originator2", originator2.createMemento());
		originator2.showState();
		originator2.testState2();
		originator2.showState();
		originator2.restoreMemento(mementoCaretaker.retrieveMemento("Originator2"));
		originator2.showState();
	}

}
