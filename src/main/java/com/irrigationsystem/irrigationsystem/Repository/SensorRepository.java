package com.irrigationsystem.irrigationsystem.Repository;

import com.irrigationsystem.irrigationsystem.Model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
