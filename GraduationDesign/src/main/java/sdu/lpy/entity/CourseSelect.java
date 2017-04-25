package sdu.lpy.entity;

import java.util.Date;

public class CourseSelect extends CourseSelectKey {
    private Date selectTime;

    private Date cancelTime;

    private Double courseCost;

    private Double courseEvaluation;

    public Date getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(Date selectTime) {
        this.selectTime = selectTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(Double courseCost) {
        this.courseCost = courseCost;
    }

    public Double getCourseEvaluation() {
        return courseEvaluation;
    }

    public void setCourseEvaluation(Double courseEvaluation) {
        this.courseEvaluation = courseEvaluation;
    }
}