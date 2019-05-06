package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, resume1> applicantMap = new HashMap<String, resume1>();
        resume1 applicant = new resume1();
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================================================");
            System.out.print("Enter your first name, middle initial, last name below : ");
            String name = input.next();
            String middle_initial = input.next();
            String last_name = input.next();
            input.nextLine();
            System.out.println("Enter your email address");
            String email_address = input.next();
            System.out.println("Enter your phone number");
            int phone_number = input.nextInt();
            ID id = new ID(name, middle_initial, last_name, email_address, phone_number);
            applicant.setIdArr(id);

            String start = "y";



            while (start.equalsIgnoreCase("y"))

            {
                String yn = "y";
                System.out.println("== Education ==");
                input.nextLine();
                while (yn.equalsIgnoreCase("y")) {

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
                    System.out.println("would you like to add another education section?");
                    yn = input.nextLine();

                }

                yn = "y";

                System.out.println("==Experience==");
                while (yn.equalsIgnoreCase("y")) {

                    System.out.println("Enter company : ");
                    String company = input.nextLine();
                    System.out.println("enter Job title :");
                    String title = input.nextLine();
                    System.out.println("Enter Start Date :");
                    String sDate = input.nextLine();
                    System.out.println("Enter End Date :");
                    String eDate = input.nextLine();
                    System.out.println("Enter description :");
                    String description = input.nextLine();
                    System.out.println("would you like to more experience?");
                    yn = input.nextLine();
                    Experience exp = new Experience(company, title, sDate, eDate, description);
                    applicant.setExpArr(exp);

                }

                yn = "y";
                System.out.println("== Skills ==");
                while (yn.equalsIgnoreCase("y")) {
                    System.out.println("Enter skills name : ");

                    String skills = input.nextLine();
                    System.out.println("Enter competency proficiency rating\n" +
                            "( Fundamental, Novice,  Intermediate, Advanced,  Expert) : ");
                    String proficiency = input.nextLine();

                    Skills ski = new Skills(skills, proficiency);
                    applicant.setSkillsArr(ski);
                    System.out.println("Do you want to add more skills? (y/n)");
                    yn = input.nextLine();
                }
                applicantMap.put(name, applicant);

                System.out.println("\n==========================================================");
                applicant.getIDArr(0).getDescription();
                System.out.println("== Education ==");
                for (int i = 0; i < applicant.eduArr.size(); i++) {
                    applicant.getEduArr(i).getDescription();

                }
                System.out.println(("== Experience =="));

                for (int i = 0; i < applicant.expArr.size(); i++) {
                    applicant.getExpArr(i).getDescription();
                }

                System.out.println(("== Skills =="));
                applicant.getSkillsArr(4).getDescription();
                for (int i = 0; i < applicant.skillsArr.size(); i++) {
                    if ( i<=0 ){
                        applicant.getSkillsArr(0).getDescription();
                        break;


                    }

                }

            }

        }
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




