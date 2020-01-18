package com.learn.pattern.memento;

import java.util.HashMap;

/**
 * 发起者
 */
public class Originator {
	private HashMap<String,String> state;
	
	public Originator(){
		state = new HashMap<String,String>();
	}
	
	public MementoIF createMemento(){
		return new Memento(state);
	}
	
	public void restoreMemento(MementoIF memento){
		state = ((Memento)memento).getState();
	}
	
	public void showState(){
		System.out.println("now state:"+state.toString());
	}
	
	public void testState1(){
		state.put("blood", "500");
		state.put("progress", "gate1 end");
		state.put("enemy", "5");	
	}
	
	public void testState2(){
		state.put("blood", "450");
		state.put("progress", "gate3 end");
		state.put("enemy", "3");	
	}
	
	private class Memento implements MementoIF {

		private HashMap<String,String> state;
		
		public Memento(HashMap<String, String> state) {
			this.state = new HashMap<>(state);
		}

		private HashMap<String, String> getState() {
			return state;
		}
	}
}
