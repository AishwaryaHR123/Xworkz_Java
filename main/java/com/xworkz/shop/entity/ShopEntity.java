package com.xworkz.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopEntity {
    @Id
    @Column(name="b_id")
    private int id;

    @Column(name="brand")
    private String brand;

    @Column(name="light_Type")
    private String lightType;

    @Column(name="special_feature")
    private String specialFeature;

    @Column(name="wattage")
    private String wattage;

    @Column(name="b_shape_size")
    private String bulbShapeSize;

    @Column(name="b_Base")
    private String bulbBase;

    @Column(name="IE_Wattage")
    private String ieWattage;

    @Column(name="Light_colour")
    private String lightColour;

    @Column(name="Voltage")
    private String voltage;

    @Column(name="net_quantity")
    private int netQuantity;

}
