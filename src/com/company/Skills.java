package com.company;

public class Skills {

    private String skill_name;
    private String competency;

    public Skills() {
    }


    public Skills(String skill_name, String competency) {
        this.skill_name = skill_name;
        this.competency = competency;
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

    public void getDescription(){
        System.out.println("Skills \r\n" + skill_name + "," + competency + "\r\n" + skill_name + "," + competency + "\r\n" + skill_name + "," + competency);
    }
}

