package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepository;
import com.xworkz.fertilizer.repository.FertilizerRepositoryImpl;

import java.time.LocalDate;

public class FertilizerRunner {
    public static void main(String[] args) {
        FertilizerEntity entity=new FertilizerEntity(0,"Potassium",2,1200, LocalDate.of(2023,10,11),LocalDate.of(2024,05,11));
        FertilizerRepository repo=new FertilizerRepositoryImpl();
        repo.save(entity);
    }
}
