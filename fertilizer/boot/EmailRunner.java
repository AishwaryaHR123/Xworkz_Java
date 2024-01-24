package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.repository.EmailRepository;
import com.xworkz.fertilizer.repository.EmailRepositoryImpl;


import java.time.LocalDate;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity entity1=new EmailEntity(0,"Rajajinagar","aishwarya34@gmail.com","mounika@gmail.com","Leave Application","anusha@gmail.com","hr@gmail.com","i want to holiday", LocalDate.of(2024,04,11),true);
        EmailRepository repository=new EmailRepositoryImpl();
        repository.save(entity1);
    }
}
