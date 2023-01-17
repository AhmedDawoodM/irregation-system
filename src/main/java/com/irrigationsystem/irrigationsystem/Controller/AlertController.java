package com.irrigationsystem.irrigationsystem.Controller;

import com.irrigationsystem.irrigationsystem.Entity.Alert;
import com.irrigationsystem.irrigationsystem.Entity.Sensor;
import com.irrigationsystem.irrigationsystem.Service.AlertService;
import com.irrigationsystem.irrigationsystem.Service.SensorService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alertApi")
public class AlertController {

    Counter hitCounter;

    public AlertController(MeterRegistry meterRegistry){
        hitCounter = Counter.builder("hit_counter")
                .description("Number of hits")
                .register(meterRegistry);
    }

    @Autowired
    private SensorService sensorService;


    @GetMapping("/alert")
    public String getAlert(){
        hitCounter.increment();
        List<Sensor> sensors = sensorService.getSensors();
        if(sensors.isEmpty()){
            return sensorService.getAlert();
        }
        return null;
    }


}
