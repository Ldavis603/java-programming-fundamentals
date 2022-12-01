package com.davis.conditional;

import java.util.Scanner;

public class ClassAttendance {
    public static void main(String[] args) {
        int classesHeld;
        int classesAttended;
        int classAttendance;

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many classes have been held?");
        classesHeld = userInput.nextInt();

        System.out.println("How many classes have you attended?");
        classesAttended = userInput.nextInt();

        classAttendance = classesAttended * classesHeld;

        if (classAttendance < 70) {
            System.out.println(" " + classAttendance + " " + " % class attendance. The student will not be allowed to sit for the exam");

        } else if (classAttendance > 70) {
            System.out.println(" " + classAttendance + " " + " % class attendance. The student will be allowed to sit for the exam");

        }


    }
}
