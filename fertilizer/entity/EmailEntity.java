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
@Table(name="email_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailEntity {
    @Id
    @Column(name="email_id")
    private int id;

    @Column(name="address")
    private String address;

    @Column(name="from_email")
    private String from;

    @Column(name="to_email")
    private String to;

    @Column(name="subject")
    private String subject;

    @Column(name="cc")
    private String cc;

    @Column(name="bcc")
    private String bcc;

    @Column(name="body")
    private String body;

    @Column(name="sendDate")
    private LocalDate sendDate;

    @Column(name="success")
    private boolean success;
}
