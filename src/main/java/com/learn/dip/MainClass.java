package com.learn.dip;

public class MainClass {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setMainBoard(new HuaSuoMainBoard());
		computer.setMemory(new JinShiDunMemory());
		computer.setHarddisk(new XiJieHardDisk());
		
		computer.display();
		
		System.out.println("-------------");
		
		computer.setMainBoard(new WeiXingMainBoard());
		computer.display();
	}
}
