package com.irrigationsystem.irrigationsystem.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class TimeSlots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    String timeSlotRange;

    public TimeSlots(String timeSlotRange) {
        this.timeSlotRange = timeSlotRange;
    }
}
