package com.Gomes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ask how many Students we want to add
        System.out.println("Enter number of new students to enroll : ");
        Scanner in = new Scanner(System.in);
        int numOfStu = in.nextInt();
        Student[] students = new Student[numOfStu];

        //Create n number of students
        for (int n = 0; n < numOfStu; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }
    }
}
