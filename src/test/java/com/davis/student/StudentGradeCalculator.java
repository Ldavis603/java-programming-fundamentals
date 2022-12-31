package com.davis.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        //Declare and initialize student grades.
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};

        //Declare and initialize student names.
        String[] students = {"April", "Ben", "Chris"};

        //Declare and initialize an int array
        int[] grades = null;

        //Prompt user to pick a student

        Scanner userInput = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.print("Enter a student's name:");
        String selectedStudentName = userInput.nextLine();


        // Set the grades variables based on selected student
        if (selectedStudentName.equals("April")) {
            grades = studentOneGrades;
            System.out.println("Grades =" + Arrays.toString(studentOneGrades));
        } else if (selectedStudentName.equals("Ben")) {
            grades = studentTwoGrades;
            System.out.println("Grades =" + Arrays.toString(studentTwoGrades));
        } else if (selectedStudentName.equals("Chris")) {
            grades = studentThreeGrades;
            System.out.println("Grades =" + Arrays.toString(studentThreeGrades));
        }
            // Validate student name

            if (!selectedStudentName.equals("April")
                    && !selectedStudentName.equals("Ben")
                    && !selectedStudentName.equals("Chris")) {
                System.out.println("There is no student with that name");
            } else {
            }

            //Iterating
        int sum = 0;
        for(int grade : grades) {
            sum = sum + grade;
        }

             //Calculate and Print the Average
        double numberOfGrades = grades.length;
        double average =  sum/numberOfGrades;

        System.out.println("Sum " + sum);
        System.out.println("Average " + average);

             // Print the Student's Grade
        if (average >= 90) {
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        }
    }







