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
@Table(name = "fertilizer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FertilizerEntity {

    @Id
    @Column(name = "f_id")
    private int id;

    @Column(name = "f_name")
    private String fertilizerName;

    @Column(name = "f_quantity")
    private int quantity;

    @Column(name = "f_cost")
    private double cost;

    @Column(name = "f_manfDate")
    private LocalDate manfDate;

    @Column(name = "f_expDate")
    private LocalDate expDate;
}
