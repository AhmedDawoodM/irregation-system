package com.irrigationsystem.irrigationsystem.Entity;


import javax.persistence.*;

@Entity
@Table(name = "time_slots")
public class TimeSlots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long timeSlotId;

    @Column(name = "time_slot_range")
    String timeSlotRange;

    public TimeSlots(String timeSlotRange) {
        this.timeSlotRange = timeSlotRange;
    }

    public TimeSlots() {

    }

    public Long getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(Long timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getTimeSlotRange() {
        return timeSlotRange;
    }

    public void setTimeSlotRange(String timeSlotRange) {
        this.timeSlotRange = timeSlotRange;
    }
}
