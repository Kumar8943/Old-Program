package org.transport;

import org.road.*;
import org.water.Water;
import org.air.Air;

public class Transport {
	public void transportform() {
 System.out.println("Transport Form");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		t.transportform();
		Road r = new Road();
		r.bike();
		r.cycle();
		r.car();
		r.bus();
		Air a = new Air();
		a.aeroplane();
		a.helicopter();
		Water w = new Water();
		w.boat();
		w.ship();
	}

}
