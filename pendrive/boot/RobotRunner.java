package com.xworkz.pendrive.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pendrive.app.dto.RobotDTO;

public class RobotRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Robot");
		RobotDTO dto=new RobotDTO("R2-D2", 50078, true, "walking");
		RobotDTO dto1=new RobotDTO("Rosie", 65478, true, "Running");
		RobotDTO dto2=new RobotDTO("Johnny", 347892, false, "Flying");
		RobotDTO dto3=new RobotDTO("Asimo", 98763, true, "Swimming");
		RobotDTO dto4=new RobotDTO("RoboCop", 234500, true, "Rolling");
		Collection<RobotDTO> robot=new ArrayList<RobotDTO>();
		robot.add(dto);
		robot.add(dto1);
		robot.add(dto2);
		robot.add(dto3);
		robot.add(dto4);
		
		robot.stream().sorted().forEach(robo->System.out.println(robo));


		
	}

}
