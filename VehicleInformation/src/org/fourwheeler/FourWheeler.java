package org.fourwheeler;

import org.allvehicle.Vehicle;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class FourWheeler {
	public void car() {
		System.out.println("Car : BMW");

	}
	public void bus() {
		System.out.println("Bus : Volvo");

	}
	
	public void lorry() {
		System.out.println("Lorry : Bharat Benz");

	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.VehicleNecessary();
		
		TwoWheller w = new TwoWheller();
		w.bike();
		w.cycle();
		
		ThreeWheeler h = new ThreeWheeler();
		h.Auto();
		
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
		
		
	}

}
