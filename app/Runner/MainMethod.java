package com.xworkz.Runner;

import com.xworkz.app.Interface.Engineer;
import com.xworkz.app.Interface.Metro;
import com.xworkz.app.Interface.Military;
import com.xworkz.app.Interface.Pg;
import com.xworkz.app.Interface.Temple;
import com.xworkz.app.implementation.ComputerEngineer;
import com.xworkz.app.implementation.HostelPg;
import com.xworkz.app.implementation.MilitaryCommand;
import com.xworkz.app.implementation.RajajinagarMetro;
import com.xworkz.app.implementation.TempleInfo;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("--------invoking metro in main----------------");
		Metro metro = new RajajinagarMetro();
		metro.noSmoking();
		metro.security(false);
		metro.ticket(200);

		System.out.println("-------invoking Temple in main----------------");
		Temple temple = new TempleInfo();
		temple.dressCode("Chudi Dhar");
		temple.entryFee(500);
		temple.templeName("Kengeri");

		System.out.println("-------invoking Pg in main-------------------");
		Pg pg = new HostelPg();
		pg.fee(300);
		pg.pgName("SJR");
		pg.timing("Indiranagar");

		System.out.println("-------invoking Engineer in main-------------------");
		Engineer engineer = new ComputerEngineer();
		engineer.attendance("Anmol");
		engineer.exam(1500, "Davanagere");
		engineer.branch();

		System.out.println("-------invoking Military in main-------------------");
		Military military = new MilitaryCommand();
		military.discipline("India");
		military.service();
		military.unifrom(true);

	}

}
