package com.xworkz.game.boot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.game.app.dto.GameDTO;

public class GameRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GameRunner");
		GameDTO dto1=new GameDTO(1, "Cricket", 12, 150,LocalDate.of(2023, 10, 8) ,"India",  "Australia", LocalTime.of(10, 30));
		GameDTO dto2=new GameDTO(2, "FootBall", 15, 150,LocalDate.of(2023, 9, 18) ,"Bengaluru FC",  "Ozone FC", LocalTime.of(12, 45));
		GameDTO dto3=new GameDTO(3, "Kabbadi", 7, 225,LocalDate.of(2023, 10, 28) ,"Bengaluru Bulls",  "Telugu Titans", LocalTime.of(9, 30));
		GameDTO dto4=new GameDTO(4, "Kho-Kho", 10, 300,LocalDate.of(2023, 11, 1) ,"Karnataka",  "TamilNadu", LocalTime.of(2, 45));
		GameDTO dto5=new GameDTO(5, "Chess", 2, 350,LocalDate.of(2023, 11, 6) ,"Viswanathan Anand",  "Gopal", LocalTime.of(8, 40));
		GameDTO dto6=new GameDTO(6, "Carrom", 4, 100,LocalDate.of(2023, 10, 17) ,"Maria Irudayam",  "Rashid Ismail", LocalTime.of(15, 30));
		GameDTO dto7=new GameDTO(7, "VolleyBall", 6, 260,LocalDate.of(2023, 11, 4) ,"Karnataka",  "Maharastra", LocalTime.of(5,55));
		GameDTO dto8=new GameDTO(8, "Badminton", 2, 350,LocalDate.of(2023, 10, 15) ,"China",  "India", LocalTime.of(14,15));
		GameDTO dto9=new GameDTO(9, "Athletics", 11, 170,LocalDate.of(2023, 10, 19) ,"India",  "Spain", LocalTime.of(1,20));
		GameDTO dto10=new GameDTO(10, "kite flying",4, 180,LocalDate.of(2023, 10, 20) ,"Minions",  "Navagraha", LocalTime.of(3,50));
		
		Collection<GameDTO> collection=Stream.of(dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10).sorted().collect(Collectors.toList());
		collection.forEach(a->System.out.println(a));
		
		
		System.out.println("----------------------Name Ascending---------------------------");
		Comparator<GameDTO> com1=(t1,t2)->t1.getName().compareTo(t2.getName());
		collection.stream().sorted(com1).forEach(a->System.out.println(a));
		
		System.out.println("---------------------Name Desc-----------------------------");
		Comparator<GameDTO> com2=(t1,t2)->t2.getName().compareTo(t1.getName());
		collection.stream().sorted(com2).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------Points Ascending----------------------------");
		Comparator<GameDTO> com3=(t1,t2)->t1.getPoints().compareTo(t2.getPoints());
		collection.stream().sorted(com3).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------Points Descending--------------------------");
		Comparator<GameDTO> com4=(t1,t2)->t2.getPoints().compareTo(t1.getPoints());
		collection.stream().sorted(com4).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------Event Ascending--------------------------");
		Comparator<GameDTO> com5=(t1,t2)->t1.getEventDate().compareTo(t2.getEventDate());
		collection.stream().sorted(com5).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------Event Descending--------------------------");
		Comparator<GameDTO> com6=(t1,t2)->t1.getEventDate().compareTo(t2.getEventDate());
		collection.stream().sorted(com6).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------Names And Points--------------------------");
		Comparator<GameDTO> nameComparing=(t1,t2)->t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> pointComparing=(t1,t2)->t1.getPoints().compareTo(t2.getPoints());
		collection.stream().sorted(nameComparing.thenComparing(pointComparing)).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------Name Points And EventDate-------------------");
		Comparator<GameDTO> nameComparing1=(t1,t2)->t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> pointComparing1=(t1,t2)->t1.getPoints().compareTo(t2.getPoints());
		Comparator<GameDTO> eventComparing=(t1,t2)->t1.getEventDate().compareTo(t2.getEventDate());
		collection.stream().sorted(nameComparing1.thenComparing(pointComparing1).thenComparing(eventComparing)).forEach(b->System.out.println(b));
		
		System.out.println("-------------------------Duration,eventDate,id--------------------------");
		Comparator<GameDTO> eventComparing1=(t1,t2)->t1.getEventDate().compareTo(t2.getEventDate());
		Comparator<GameDTO> durationComparing=(t1,t2)->t2.getDuration().compareTo(t1.getDuration());
		Comparator<GameDTO> idComparing=(t1,t2)->t1.getId().compareTo(t2.getId());
		collection.stream().sorted(eventComparing1.thenComparing(durationComparing).thenComparing(idComparing)).forEach(c->System.out.println(c));

		
		System.out.println("----------------------------Duration--------------------------------------");
		Comparator<GameDTO> com8=(t1,t2)->t2.getDuration().compareTo(t1.getDuration());
		collection.stream().sorted(com8).forEach(a->System.out.println(a.getDuration()));

		System.out.println("-----------------Names------------------------------------");
		Comparator<GameDTO> com9=(t1,t2)->t1.getName().compareTo(t2.getName());
		collection.stream().sorted(com9).forEach(b->System.out.println(b.getName()));
		
		System.out.println("--------------------Winners-------------------------------------");
		
		Comparator<GameDTO> com10=(t1,t2)->t2.getWinner().compareTo(t1.getWinner());
		collection.stream().sorted(com10).forEach(a->System.out.println(a.getWinner()));
		
		System.out.println("---------------RunnerUp------------------------------------");
		Comparator<GameDTO> com11=(t1,t2)->t1.getRunnerUp().compareTo(t2.getRunnerUp());
		collection.stream().sorted(com11).forEach(b->System.out.println(b.getRunnerUp()));
		
		System.out.println("------------------------Game By Name----------------------------------");
		
		
		System.out.println("-------------Game By EventDate-------------------------------------");
		collection.stream().filter(c->c.getName().equals("VolleyBall")).map(c->c.getEventDate()).forEach(a->System.out.println(a));
		
		System.out.println("-------------Winner By Game-------------------------------------");
		collection.stream().filter(a->a.getWinner().equals("India")).map(c->c.getName()).forEach(b->System.out.println(b));
		
		System.out.println("-------------Points By Game-------------------------------------");
		collection.stream().filter(a->a.getPoints().equals(150)).map(c->c.getName()).forEach(c->System.out.println(c));
 
	}

}
