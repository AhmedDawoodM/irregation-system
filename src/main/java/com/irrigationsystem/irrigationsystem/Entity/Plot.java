package com.irrigationsystem.irrigationsystem.Entity;


import javax.persistence.*;

@Entity
@Table(name = "plot")
public class Plot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long plotId;

    @Column(name = "plot_name")
    String plotName;

    @Column(name = "plot_target")
    String plotTarget;

    @Column(name = "desc")
    String desc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_slots_id")
    TimeSlots timeSlots;

    public Plot() {
    }

    public Plot(String plotName, String plotTarget, String desc) {
        this.plotName = plotName;
        this.plotTarget = plotTarget;
        this.desc = desc;
    }

    public Plot(TimeSlots timeSlots) {
        this.timeSlots = timeSlots;
    }

    public Long getPlotId() {
        return plotId;
    }

    public void setPlotId(Long plotId) {
        this.plotId = plotId;
    }

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName;
    }

    public String getPlotTarget() {
        return plotTarget;
    }

    public void setPlotTarget(String plotTarget) {
        this.plotTarget = plotTarget;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TimeSlots getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(TimeSlots timeSlots) {
        this.timeSlots = timeSlots;
    }
}
