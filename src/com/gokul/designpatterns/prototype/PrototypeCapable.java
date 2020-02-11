package com.gokul.designpatterns.prototype;

public interface PrototypeCapable extends Cloneable{
	
	public PrototypeCapable clone() throws CloneNotSupportedException;

}
