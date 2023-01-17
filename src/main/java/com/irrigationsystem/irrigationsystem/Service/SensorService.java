package com.irrigationsystem.irrigationsystem.Service;

import com.irrigationsystem.irrigationsystem.Entity.Alert;
import com.irrigationsystem.irrigationsystem.Entity.Sensor;

import java.util.List;

public interface SensorService {
    
    List<Sensor> getSensors();

    String getAlert();
}
