package com.irrigationsystem.irrigationsystem.Repository;

import com.irrigationsystem.irrigationsystem.Model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository <Alert, Long> {
}
