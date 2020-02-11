package com.gokul.designpatterns.singleton;

public class SingletonPerson {
	private int id;
	private String name;
	
	private static SingletonPerson person; 
	
	private SingletonPerson(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public static SingletonPerson getInstance(int id, String name){
		if(person == null){
			synchronized (SingletonPerson.class) {
				if(person == null){
					person = new SingletonPerson(id, name);
				}
			}
		}
		return person;
	}


	@Override
	public String toString() {
		return "\nSingletonPerson [id=" + id + ", name=" + name + "]";
	}
	
	
}
