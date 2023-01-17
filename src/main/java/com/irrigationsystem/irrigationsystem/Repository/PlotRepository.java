package com.irrigationsystem.irrigationsystem.Repository;

import com.irrigationsystem.irrigationsystem.Entity.Plot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlotRepository extends JpaRepository <Plot, Long> {
}
