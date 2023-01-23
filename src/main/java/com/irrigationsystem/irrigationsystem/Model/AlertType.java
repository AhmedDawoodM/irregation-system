package com.irrigationsystem.irrigationsystem.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AlertType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String alertTypeName;

    public AlertType (String alertTypeName) {
        this.alertTypeName = alertTypeName;
    }
}
