package org.network;

public class Wireless {
public void modemName() {
	System.out.println("ModemName : T Link");

}

public static void main(String[] args) {
	
	Wifi w = new Wifi();
	w.wifiName();

	MobileData m = new MobileData();
	m.dataName();
	
	Lan l = new Lan();
	l.lanNames();
	
	Wireless i = new Wireless();
	i.modemName();
}

}
