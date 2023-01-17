package com.irrigationsystem.irrigationsystem.Entity;


import javax.persistence.*;

@Entity
@Table(name = "alert")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String alertId;

    @Column(name = "alert_name")
    String alertName;

    @Column(name = "desc")
    String desc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_type")
    AlertType alertType;

    public Alert() {
    }

    public Alert(String alertName, String desc, AlertType alertType) {
        this.alertName = alertName;
        this.desc = desc;
        this.alertType = alertType;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AlertType getAlertType() {
        return alertType;
    }

    public void setAlertType(AlertType alertType) {
        this.alertType = alertType;
    }
}
