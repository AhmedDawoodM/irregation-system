package com.irrigationsystem.irrigationsystem.Controller;

import com.irrigationsystem.irrigationsystem.Model.Plot;
import com.irrigationsystem.irrigationsystem.Model.TimeSlots;
import com.irrigationsystem.irrigationsystem.Service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/plotApi")
@RestController
public class PlotController {

    @Autowired
    PlotService plotService;

    @GetMapping("/plots")
    public List<Plot> getAllPlots() {
        return plotService.getAllPlots();
    }

    @GetMapping("/plots/{id}")
    public Plot getPlotById(@PathVariable("id") Long id) {
        return plotService.getPlot(id);
    }

    @PostMapping("/plots")
    public Plot savePlot(@RequestBody Plot plot) {
        return plotService.savePlot(plot);
    }

    @PutMapping("/plots/{id}")
    public Plot updatePlot(@PathVariable("id") Long id, @RequestBody Plot plot) {
        return plotService.updatePlot(id, plot);
    }

    @DeleteMapping("/plots/{id}")
    public String deletePlot(@PathVariable("id") Long id) {
        return plotService.deletePlot(id);
    }

    @PostMapping("/plots/configure/{id}")
    public Plot configurePlot(@PathVariable("id") Long id, @RequestBody TimeSlots timeSlots, String timeSlotRange){
        return plotService.configurePlot(id, timeSlots, timeSlotRange);
    }


}
