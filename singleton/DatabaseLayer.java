package com.progrank.singleton;

public class DatabaseLayer {
//	private static DatabaseLayer db=new DatabaseLayer();
//	
//	private DatabaseLayer() {
//		
//	}
//	public static DatabaseLayer getInstance() {
//		return db;
//	}
	
	
	// double checked locking
	
	private static volatile DatabaseLayer db=null;
	private DatabaseLayer() {}
	public static DatabaseLayer getInstance() {
		if(db==null) {
			synchronized(DatabaseLayer.class){
				if(db==null)
					db=new DatabaseLayer();
			}
		}
		return db;
	}
}
