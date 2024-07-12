package com.example.spring_poc_curd;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
//table creation//
@Entity
public class Ekart {
    //primary key//
    @Id
    // auto increment
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private int receiverContact;
    private double productprice;
    private String productStatus;
    private String executiveName;

}

