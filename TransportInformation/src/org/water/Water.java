package org.water;

import org.air.Air;
import org.road.Road;
import org.transport.Transport;

public class Water {
public void boat() {
	System.out.println("Boat : Arabella");
	}
public void ship() {
	System.out.println("Ship : Caravel");

}

public static void main(String[] args) {
	Transport t = new Transport();
	t.transportForm();
	
	Road r = new Road();
	r.bike();
	r.cycle();
	r.car();
	
	Air a = new Air();
	a.aeroplane();
	a.helicopter();
	
	Water w = new Water();
	w.boat();
	w.ship();
	
	
}

}
