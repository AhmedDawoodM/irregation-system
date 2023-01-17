package com.irrigationsystem.irrigationsystem.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String sensorId;

    @Column(name = "sensor_name")
    String sensorName;

    @Column(name = "sensorLocation")
    String sensorLocation;

    @Column(name = "is_available")
    Boolean isAvailable;

    public Sensor() {
    }

    public Sensor(String sensorName, String sensorLocation, Boolean isAvailable) {
        this.sensorName = sensorName;
        this.sensorLocation = sensorLocation;
        this.isAvailable = isAvailable;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorLocation() {
        return sensorLocation;
    }

    public void setSensorLocation(String sensorLocation) {
        this.sensorLocation = sensorLocation;
    }

    public Boolean getAvailable() { return isAvailable; }

    public void setAvailable(Boolean available) { isAvailable = available; }
}
