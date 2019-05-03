package com.company;

public class Education {

    private String degree_type;
    private String major;
    private String university_name;
    private int graduation_year;

    public Education() {
    }

    public String getDegree() {
        return degree_type;
    }

    public void setDegree(String degree) {
        this.degree_type = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public int getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(int graduation_year) {
        this.graduation_year = graduation_year;
    }


    public String getDescription(){

        return "Education\r\n" + degree_type + "in" + major + ", \r\n" + university_name;

    }

}
