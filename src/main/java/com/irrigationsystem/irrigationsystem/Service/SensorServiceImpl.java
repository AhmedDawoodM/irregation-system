package com.irrigationsystem.irrigationsystem.Service;

import com.irrigationsystem.irrigationsystem.Entity.Alert;
import com.irrigationsystem.irrigationsystem.Entity.Sensor;
import com.irrigationsystem.irrigationsystem.Repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorServiceImpl implements SensorService{

    @Autowired
    SensorService sensorService;
    @Autowired
    private SensorRepository sensorRepository;

    @Override
    public List<Sensor> getSensors() {
        List<Sensor> sensors = new ArrayList<>();
        sensorRepository.findAll().forEach(sensor ->sensors.add(sensor)); // keep each student in students list
        return sensors;
    }

    @Override
    public String getAlert() {
        return "the sensor not available";
    }
}
