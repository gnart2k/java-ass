package Controller;

import Model.Course;
import Validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManager {
    public ArrayList<Course> ls = new ArrayList<>();
    Validate validate = new Validate();
    public void createCourse (int limit ){
        int count = 0;
        while (count < limit){
            System.out.print("Enter Course ID: ");
            String courseId = Validate.checkInputString();
            System.out.print("Enter Course Name: ");
            String courseName = Validate.checkInputString();
            System.out.print("Enter Course Duration: ");
            String courseDuration = Validate.checkInputString();
            System.out.print("Enter Status: ");
            String status = Validate.checkInputString();
            System.out.print("Enter flag (optional or mandatory): ");
            String flag = Validate.checkInputFlag();
            count++;
        }
    }

    public void find(String name, ArrayList<Course> courses){
        ArrayList<Course> rs = new ArrayList<>();
        for(Course course:ls){
            if(course.getCourseName().contains(name)){
                rs.add(course);
            }
        }
        print(rs);
    }

    public void searchByName(){
        System.out.print("type name to search: ");
        String name = new Scanner(System.in).nextLine();
        find(name, ls);
    }

    public void printMandatory(){
        ArrayList<Course> rs = new ArrayList<>();
        if(rs.size() == 0){
            System.out.println("Empty list course");
        }else{
            for(Course course:ls){
                if(course.getFlag().toLowerCase().trim().equals("mandatory")){
                    rs.add(course);
                }
            }
            print(rs);
        }
    }

    public void print(ArrayList<Course> courses){
        for(Course course:courses){
            System.out.println(course.toString());
        }
    }


    public void menu() {
        while(true){
            System.out.println(" 1.	Create");
            System.out.println(" 2.	Search");
            System.out.println(" 3.	Display mandatory course");
            System.out.println(" other key for exiting");
            System.out.print(" Enter your choice: ");
            int limit = 10;
            String choice  = new Scanner(System.in).nextLine();
            switch (choice){
                case "1":
                    createCourse(limit);
                    break;
                case "2":
                     searchByName();
                    break;
                case "3":
                    printMandatory();
                    break;
                default:
                    System.exit(1);
            }
        }
    }



}
