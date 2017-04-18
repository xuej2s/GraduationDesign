package sdu.lpy.entity;

import java.util.Date;

public class Course {
    private String courseId;

    private String courseName;

    private Integer sumPerson;

    private Integer selectedPerson;

    private Date startTime;

    private Date endTime;

    private String weekend;

    private Double courseCost;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getSumPerson() {
        return sumPerson;
    }

    public void setSumPerson(Integer sumPerson) {
        this.sumPerson = sumPerson;
    }

    public Integer getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(Integer selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend == null ? null : weekend.trim();
    }

    public Double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(Double courseCost) {
        this.courseCost = courseCost;
    }
}