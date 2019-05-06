package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, resume1> applicantMap = new HashMap<String, resume1>();
        resume1 applicant = new resume1();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Enter your email address");
        String email = input.nextLine();
        ID id = new ID(firstname, middleinitial, lastname, email);
        applicant.setIdArr(id);

        String start = "y";
        while (start.equalsIgnoreCase("y")){
            String yn = "y";
            System.out.println("== Education ==");
            while (yn.equalsIgnoreCase("y")){
                System.out.println("Enter Degree Type :");
                String degree = input.nextLine();
                System.out.println("Enter Major :");
                String major = input.nextLine();
                System.out.println("Enter University name :");
                String university = input.nextLine();
                System.out.println("Enter graduation Year :");
                String graduation = input.nextLine();
                Education edu = new Education(degree, major, university, graduation);
                applicant.setEduArr(edu);

            }

            yn = "y";
            System.out.println("==Experience==");
            while (yn.equalsIgnorCase("y")){
                System.out.println("Enter company name : ");
                String company = input.nextLine();
                System.out.println("enter Job title :");
                String title = input.nextLine();
                System.out.println("Enter Start Date :");
                String sDate = input.nextLine();
                System.out.println("Enter End Date :");
                String eDate = input.nextLine();
                String description = input.nextLine();
                Experience exp = new Experience(company, title, sDate, eDate, description);
                applicant.setExpArr(exp);

            }

            yn = "y";
            System.out.println("== Skills ==");
            while ( +.equalsIgnoreCase("y")){
                System.out.println("Enter skills name : ");
                String skills = input.nextLine();
                System.out.println("Enter competency proficiency ratint\n" +
                        "(1 = Fundamental, 2 = Novice, 3 = Intermediate, 4 = Advanced, 5 = Expert) : ");
                String proficiency = input.nextLine();

                Skills ski = new Skills(skill, proficiency);
                applicant.setSkillsArr(ski);
                System.out.println("Do you want to add more skills? (y/n)");
                yn = input.nextLine();
        }
            applicantMap.put(name, applicant);

            System.out.println("\n============================================");
            System.out.println(applicant.getIdArr(0).toString());
        }
//        Scanner scanner = new Scanner (System.in);
////
////        ArrayList<String> ID = new ArrayList <String>();
////
////        String ID = "";
////        System.out.println("Enter your name and email address");
////        public String getID();{
////            return ID;
////        }
////            id = scanner.nextLine();
////
////
////
////
////        ArrayList<String> Education = new ArrayList <String>();
////        String education = "";
////        System.out.println("Education");
////        education = scanner.nextLine();
////
////
////        ArrayList<String> Experience = new ArrayList <String>();
////        String experience = "";
////        System.out.println("Experience");
////
////
////
////        ArrayList<String> Skills = new ArrayList <String>();
////        String skills = "";
////        System.out.println("Skills");
////
////
//////        Scanner keyboard;
//////        keyboard = new Scanner (System.in);
//////
//////        ID resume1 = new ID ("first name" + "middle initial" + "last name \r\n"+ "email address");
//////        System.out.println(resume1);
//////
//////        Education resume2 = new Education ("degree")
//////
//////        ArrayList<ID> resume = new ArrayList<>();
//////        public ArrayList<ID> getID(){
//////            return ID;
//    }
//
//        ArrayList<Education> resume = new ArrayList<>();
//                public ArrayList<Education> getEducation(){
//            return Education;
//        }
//
//        ArrayList<Experience> resume = new ArrayList<> ();
//            public ArrayList<Experience> getExperience(){
//                    return Experience;
//        }
//
//        ArrayList<Skills> resume = new ArrayList<>();
//            public ArrayList<Skills> getSkills(){
//                return Skills;
//        }
//
//
//	   System.out.println("Create your own resume");
//
//        keyboard = new Scanner (System.in);
//        userInput = keybpard.next();
//
//        ID resume = new Main();
//
//        System.out.println("Type your name and email address");
//


    }
}
