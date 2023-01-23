package com.irrigationsystem.irrigationsystem.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String sensorName;
    private String sensorLocation;
    private Boolean isAvailable;

    public Sensor(String sensorName, String sensorLocation, Boolean isAvailable) {
        this.sensorName = sensorName;
        this.sensorLocation = sensorLocation;
        this.isAvailable = isAvailable;
    }

 }
