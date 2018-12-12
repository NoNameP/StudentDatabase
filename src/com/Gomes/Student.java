package com.Gomes;

import java.util.Scanner;

public class Student {
    private static int costPerCourse = 600;
    private String firstName;
    private String lastName;
    private int semester;
    private int studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private int id;

    //Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name : ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Semester : ");
        this.semester = in.nextInt();
        setStudentID();
    }

    //Generate ID
    private void setStudentID() {
        //Student ID should be Grade level + 1000 + n
        id++;
        this.studentID = (semester * 10000) + id;
    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costPerCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View balance and pay tuition
    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Please enter how much you want to pay ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        if (payment <= tuitionBalance) {
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for your payment of : $" + payment);
            viewBalance();
        } else {
            System.out.println("Error , You can not pre pay your tuition");
        }
    }

    //Status of Student
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nSemester : " + semester +
                "\nCourses Enrolled: " + courses +
                "\nTotal balance : " + tuitionBalance;
    }
}
