package com.design.pattern.singleton;

/**
 * Singleton class: which creates only one object in lifetime
 * @author pramod.dhone
 *
 */
public class Singleton {
	
	private static volatile Singleton singleton;
	
	private Singleton() {

	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
	}

}
