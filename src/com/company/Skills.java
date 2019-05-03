package com.company;

public class Skills {

    private String skill_name;
    private String competency;

    public Skills() {
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public String getDescription(){
        return "Skills \r\n" + skill_name + "," + competency + "\r\n" + skill_name + "," + competency + "\r\n" + skill_name + "," + competency;
    }
}
