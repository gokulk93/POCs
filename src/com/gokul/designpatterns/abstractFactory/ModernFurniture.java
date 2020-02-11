package com.gokul.designpatterns.abstractFactory;

public class ModernFurniture implements FurnitureFactory{

	@Override
	public Chair createChair() {
		
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		
		return new ModernSofa();
	}

}
