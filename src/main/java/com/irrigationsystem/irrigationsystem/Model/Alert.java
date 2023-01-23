package com.irrigationsystem.irrigationsystem.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String alertName;
    private String desc;
    @ManyToOne(fetch = FetchType.LAZY)
    private AlertType alertType;

    public Alert(String alertName, String desc, AlertType alertType) {
        this.alertName = alertName;
        this.desc = desc;
        this.alertType = alertType;
    }

}
