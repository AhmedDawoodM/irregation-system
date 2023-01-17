package com.irrigationsystem.irrigationsystem.Entity;

import javax.persistence.*;

@Entity
@Table(name = "alert_type")
public class AlertType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String alertTypeId;

    @Column(name = "alert_type_name")
    String alertTypeName;

    public AlertType() {
    }

    public AlertType(String alertTypeName) {
        this.alertTypeName = alertTypeName;
    }

    public String getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(String alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    public String getAlertTypeName() {
        return alertTypeName;
    }

    public void setAlertTypeName(String alertTypeName) {
        this.alertTypeName = alertTypeName;
    }
}
