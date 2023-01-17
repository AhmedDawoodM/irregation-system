package com.irrigationsystem.irrigationsystem.Service;

import com.irrigationsystem.irrigationsystem.Entity.Plot;
import com.irrigationsystem.irrigationsystem.Entity.TimeSlots;
import com.irrigationsystem.irrigationsystem.Repository.PlotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlotServiceImpl implements PlotService{
    private final PlotRepository plotRepository;

    public PlotServiceImpl(PlotRepository plotRepository) {
        this.plotRepository = plotRepository;
    }

    @Override
    public List<Plot> getAllPlots() {
        List<Plot> plots = new ArrayList(); //create list of students variable
        plotRepository.findAll().forEach(plot ->plots.add(plot)); // keep each student in students list
        return plots;
    }

    @Override
    public Plot getPlot(Long id) {
        Optional<Plot> plot = plotRepository.findById(id);
        if(plot.isPresent()) return plot.get();
        return null;
    }

    @Override
    public Plot savePlot(Plot plot) {
        return plotRepository.save(plot);
    }

    @Override
    public Plot updatePlot(Long id, Plot plot) {
        Optional<Plot> plotById = plotRepository.findById(id);

        if(plotById.isPresent()) {
            Plot updatedPlot = plotById.get();

            updatedPlot.setPlotName(plot.getPlotName());
            updatedPlot.setPlotTarget(plot.getPlotTarget());
            updatedPlot.setDesc(plot.getDesc());

            return plotRepository.save(updatedPlot);
        }
        return null;
    }

    @Override
    public String deletePlot(Long id) {
        plotRepository.deleteById(id); //delete student by id
        return "id" + id + "is deleted successfully";
    }


    @Override
    public Plot configurePlot(Long id, TimeSlots timeSlots, String range) {
        Optional<Plot> plotById = plotRepository.findById(id);

        if(plotById.isPresent()) {
            Plot configurePlot = plotById.get();
            configurePlot.setTimeSlots(timeSlots);
            return plotRepository.save(configurePlot);
        }
        return null;
    }
}
