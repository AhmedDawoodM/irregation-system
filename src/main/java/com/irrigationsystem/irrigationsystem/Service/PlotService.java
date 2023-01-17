package com.irrigationsystem.irrigationsystem.Service;

import com.irrigationsystem.irrigationsystem.Entity.Plot;
import com.irrigationsystem.irrigationsystem.Entity.TimeSlots;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlotService {

    public List<Plot> getAllPlots();
    public Plot getPlot(Long id);
    public Plot savePlot(Plot plot);
    public Plot updatePlot(Long id, Plot plot);
    public String deletePlot(Long id);
    public Plot configurePlot(Long id, TimeSlots timeSlots, String timeSlotsRange);

}
