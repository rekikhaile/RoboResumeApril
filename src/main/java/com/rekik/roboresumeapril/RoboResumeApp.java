package com.rekik.roboresumeapril;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class RoboResumeApp {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Education> educations = new ArrayList<>();
        ArrayList<Experience> experiences = new ArrayList<>();
        ArrayList<Skill> skills = new ArrayList<>();

        Person person;
        Education education;
        Experience experience;
        Skill skill;

        boolean done = true;
        LocalDate today = LocalDate.now();

        System.out.println("Today is "+today);


            person = new Person();
            System.out.println("Enter details about yourself:");
            System.out.println("Enter full name");
            person.setName(reader.nextLine());
            System.out.println("Enter an e-mail address");
            person.setEmail(reader.nextLine());

            persons.add(person);

        System.out.println("\n");

        System.out.println("Enter details about your education");


        do{

            education = new Education();

            System.out.println("Enter education name and level");
            education.setEducation(reader.nextLine());
            System.out.println("Enter name and place of institution");
            education.setInstitution(reader.nextLine());
            System.out.println("Enter graduation date or estimated graduation date");
            education.setGradDate(reader.nextLine());

            educations.add(education);

            System.out.println("Would you like to enter details of another education");
            String answer = reader.nextLine();
            if(answer.equalsIgnoreCase("no"))
                done=false;
            else
                done= true;

        }while (done);

        System.out.println("\n");

        System.out.println("Enter details of your experiences");

        do{
            experience = new Experience();

            System.out.println("Enter the name of the position :");
            experience.setPosition(reader.nextLine());
            System.out.println("Enter the company name");
            experience.setCompany(reader.nextLine());
            System.out.println("Enter your start date");
            experience.setStartDate(reader.nextLine());
            System.out.println("Enter the date your position ended");
            String isEndDate = reader.nextLine();
            if(isEndDate.isEmpty()){
                experience.setEndDate(today.toString());
            }
            else
                experience.setEndDate(isEndDate);

            experiences.add(experience);

            System.out.println("Enter your duties");
            experience.setDuties(reader.nextLine());

            System.out.println("Would you like to enter details of another experience");
            String answer = reader.nextLine();

            if(answer.equalsIgnoreCase("no"))
                done=false;
            else
                done= true;


        }while (done);

        System.out.println("\n");

        System.out.println("Enter details of your skills");
 

        do{
            skill = new Skill();
            System.out.println("Enter the name of your skill");
            skill.setSkillName(reader.nextLine());
            System.out.println("Enter the level of your skill");
            skill.setLevel(reader.nextInt());
            reader.nextLine();

            skills.add(skill);

            System.out.println("Would you like to enter details of another skill");
            String answer = reader.nextLine();

            if(answer.equalsIgnoreCase("no"))
                done=false;
            else
                done=true;

        }while (done);

        // Printing the Reusme
        // Printing the Reusme
        // Printing the Reusme
        System.out.println("*********************************************************");
        System.out.println("Personal Information");
        System.out.println("*************************");
        System.out.println("Name: "+person.getName());
        System.out.println("Email: "+person.getEmail());

        System.out.println("\n");

        System.out.println("Education");
        System.out.println("*************************");

        for(Education eachEdu: educations){
            System.out.println("Education: "+eachEdu.getEducation());
            System.out.println("Institution: "+ eachEdu.getInstitution());
            System.out.println("Graduation date: "+ eachEdu.getGradDate());
            System.out.println("\n");
        }


        System.out.println("Experience");
        System.out.println("*************************");

        for(Experience eachExpr: experiences){
            System.out.println("Position: "+eachExpr.getPosition());
            System.out.println("Company: "+ eachExpr.getCompany());
            System.out.println("Starting date: "+ eachExpr.getStartDate());
            System.out.println("Ending date: "+eachExpr.getEndDate());
            System.out.println("Duties: "+eachExpr.getDuties());



            System.out.println("\n");
        }

        System.out.println("Skills");
        System.out.println("*************************");

        for(Skill eachSkill: skills){
            System.out.println("Skill name: "+eachSkill.getSkillName());
            System.out.println("Level: "+ eachSkill.getLevel());

            System.out.println("\n");
        }

        System.out.println("*********************************************************");

    }
}
