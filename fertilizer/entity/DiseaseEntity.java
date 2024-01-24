package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table (name = "disease")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseEntity {
    @Id
    @Column(name = "d_id")
    private int id;

    @Column(name = "d_name")
    private String diseaseName;

    @Column(name = "symptom")
    private String symptom;

    @Column(name = "patient_age")
    private int patient_age;

    @Column(name = "vaccination_date")
    private LocalDate vaccinationDate;
}

