package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.DiseaseEntity;
import com.xworkz.fertilizer.repository.DiseaseRepository;
import com.xworkz.fertilizer.repository.DiseaseRepositoryImpl;

import java.time.LocalDate;

public class DiseaseRunner {
    public static void main(String[] args) {
        DiseaseEntity entity=new DiseaseEntity(0,"Chikungunya","fever",23, LocalDate.of(2023,4,12));
        DiseaseRepository repository=new DiseaseRepositoryImpl();
        repository.save(entity);
    }
}
