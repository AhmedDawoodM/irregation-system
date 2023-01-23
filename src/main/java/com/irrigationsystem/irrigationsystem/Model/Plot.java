package com.irrigationsystem.irrigationsystem.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Plot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String plotName;
    private String plotTarget;
    private String desc;
    @OneToOne(fetch = FetchType.LAZY)
    private TimeSlots timeSlots;

    public Plot(String plotName, String plotTarget, String desc, TimeSlots timeSlots) {
        this.plotName = plotName;
        this.plotTarget = plotTarget;
        this.desc = desc;
        this.timeSlots = timeSlots;
    }

}
