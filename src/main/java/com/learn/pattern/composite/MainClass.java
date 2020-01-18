package com.learn.pattern.composite;

import java.util.List;


public class MainClass {
	public static void main(String[] args) {
		//C盘
		Folder rootFolder = new Folder("C:");
		Folder compositeFolder = new Folder("composite");
	
		File compositeFile = new File("composite.txt");
		
		rootFolder.add(compositeFolder);
		rootFolder.add(compositeFile);
		
	
		Folder icompositeFolder = new Folder("composite");
		File icompositeFile = new File("composite.txt");
		compositeFolder.add(icompositeFolder);
		compositeFolder.add(icompositeFile);
		
		Folder iicompositeFolder = new Folder("composite");
		File iicompositeFile = new File("composite.txt");
		icompositeFolder.add(iicompositeFolder);
		icompositeFolder.add(iicompositeFile);
		
		displayTree(rootFolder,0);
		
	}
	
	public static void displayTree(IFile rootFolder, int deep) {
		//显示自身的名称
		rootFolder.display();
		//获得子树
		List<IFile> children = rootFolder.getChild();
		//遍历子树
		for(IFile file : children) {
			if(file instanceof File) {
				for(int i = 0; i <= deep; i++) {
					System.out.print("--");
				}
				file.display();
			} else {
				displayTree(file,deep + 1);
			}
		}
	}
}
