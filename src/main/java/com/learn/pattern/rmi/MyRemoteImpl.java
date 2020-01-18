package com.learn.pattern.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	private static final long serialVersionUID = 6524866558232229943L;

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Hello World";
	}

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			//本地注册
			LocateRegistry.createRegistry(6600);
			//必须如下写不然报错连接拒绝
			Naming.rebind("rmi://127.0.0.1:6600/RemoteHello", service);
		} catch (Exception e) {
			System.out.println("出现异常:"+e.getMessage());
		}
	}
}
