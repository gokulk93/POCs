package com.gokul.designpatterns.factory;

import java.util.Scanner;

import com.gokul.logistics.deliver.LogisticsFactory;
import com.gokul.logistics.deliver.Ship;
import com.gokul.logistics.deliver.Transport;
import com.gokul.logistics.deliver.Truck;

import logistics.deliver.Flight;

public class LogisticsClientApp {

	public static void main(String[] args) {
		
		/*
		Truck truck = new Truck();
		truck.deliver();
		
		
		Ship ship = new Ship();
		ship.deliver();
		
		Transport t = new Truck();
		Transport s = new Ship();
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String type = sc.next();
		
		
		LogisticsFactory factory = new LogisticsFactory();
		
		Transport transport = factory.getTransportType(type);
		transport.deliver();
		
		
		
	}

}
