package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.TravelEntity;
import com.xworkz.fertilizer.repository.TravelRepository;
import com.xworkz.fertilizer.repository.TravelRepositoryImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class TravelRunner {
    public static void main(String[] args) {
        TravelEntity travelEntity=new TravelEntity(0,"Bangalore","Ayodha",3000,200,"Blessing", LocalTime.of(9,50),"Train" ,LocalDate.of(2024,01,15),LocalDate.of(2024,01,22));
        TravelRepository repository=new TravelRepositoryImpl();
        repository.save(travelEntity);
    }
}
