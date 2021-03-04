package com.sbmongo.Entity;

public class StudentUpdatePayload {
    private String fName;
    private String lName;
    private String schoolName;
    private int[] marks;

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int[] getMarks(){
        return marks;
    }

}
