package com.gokul.designpatterns.abstractFactory;

public class AncientFurniture implements FurnitureFactory{

	@Override
	public Chair createChair() {
		
		return new AncientChair();
	}

	@Override
	public Sofa createSofa() {
		
		return new AncientSofa();
	}

}
