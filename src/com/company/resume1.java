package com.company;

import java.util.ArrayList;


public class resume1 {

    ArrayList<ID> idArr = new ArrayList<>();
    ArrayList<Education> eduArr = new ArrayList<>();
    ArrayList<Experience> expArr = new ArrayList<>();
    ArrayList<Skills> skillsArr = new ArrayList<>();

    public resume1() {
    }

    public resume1(ArrayList<ID> idArr, ArrayList<Education> eduArr, ArrayList<Experience> expArr, ArrayList<Skills> skillsArr) {
        this.idArr = idArr;
        this.eduArr = eduArr;
        this.expArr = expArr;
        this.skillsArr = skillsArr;

    }

    public ID getIDArr(int i) {
        return idArr.get(i);
    }

    public void setIdArr(ID id) {
        idArr.add(id);
    }

    public Education getEduArr(int i) {
        return eduArr.get(i);
    }

    public void setEduArr(Education edu) {
        eduArr.add(edu);
    }

    public Experience getExpArr(int i) {
        return expArr.get(i);
    }

    public void setExpArr(Experience exp) {
        expArr.add(exp);
    }

    public Skills getSkillsArr(int i) {
        return skillsArr.get(i);
    }

    public void setSkillsArr(Skills ski) {
        skillsArr.add(ski);
    }

}


