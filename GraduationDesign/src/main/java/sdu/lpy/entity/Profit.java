package sdu.lpy.entity;

import java.util.Date;

public class Profit {
    private Date date;

    private Double vip;

    private Double mechine;

    private Double course;

    private Double sum;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getVip() {
        return vip;
    }

    public void setVip(Double vip) {
        this.vip = vip;
    }

    public Double getMechine() {
        return mechine;
    }

    public void setMechine(Double mechine) {
        this.mechine = mechine;
    }

    public Double getCourse() {
        return course;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}