package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "travel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelEntity {

    @Id
    @Column(name="t_id")
    private int id;

    @Column(name="source")
    private String source;

    @Column(name="destination")
    private String destination;

    @Column(name="budget")
    private double budget;

    @Column(name="distance")
    private float distance;

    @Column(name="purpose")
    private String purpose;

    @Column(name="duration")
    private LocalTime duration;

    @Column(name="modeType")
    private String modeType;

    @Column(name="travelDate")
    private LocalDate travelDate;

    @Column(name="returnDate")
    private LocalDate returnDate;


}
