package pojo;

import java.util.*;

public class CourseSession {
    private String idSession;
    private String nameSession;
    private Date startDay;
    private Date endDay;
    private Semester idSemester;


    public CourseSession(String idSession, String nameSession, Date startDay, Date endDay, Semester idSemester) {
        this.idSession = idSession;
        this.nameSession = nameSession;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idSemester = idSemester;
    }

    public CourseSession() {

    }



    public Semester getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Semester idSemester) {
        this.idSemester = idSemester;
    }

    public String getIdSession() {
        return idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public String getNameSession() {
        return nameSession;
    }

    public void setNameSession(String nameSession) {
        this.nameSession = nameSession;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseSession that = (CourseSession) o;
        return Objects.equals(idSession, that.idSession) && Objects.equals(nameSession, that.nameSession) && Objects.equals(startDay, that.startDay) && Objects.equals(endDay, that.endDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSession, nameSession, startDay, endDay);
    }
}
