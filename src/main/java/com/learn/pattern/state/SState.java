package com.learn.pattern.state;

public class SState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 18) {
			System.out.println("吃晚饭");
		} else {
			person.setState(new NoState());
			person.doSomething();
		}
	}

}
