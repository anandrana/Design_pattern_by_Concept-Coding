package com.progrank.singleton;


public class DesignPatternApplication {

	public static void main(String[] args) {
		DatabaseLayer db1=DatabaseLayer.getInstance();
		System.out.println(db1);
		
		DatabaseLayer db2=DatabaseLayer.getInstance();
		System.out.println(db2);
	}

}
