package com.davis.array;
import java.util.ArrayList;
import java.util.List;

public class StudentGradeCalculator2 {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        int[] studentGrades = {100, 97, 98, 99};

        //add items to list
        grades.add(100);
        grades.add(97);
        grades.add(98);
        grades.add(99);

        System.out.println("Grades " + grades);

        //Iterating
        int sum = 0;
        for(int grade : grades) {
            sum = sum + grade;
        }


        //add to list
        List<Integer> addedGrades = new ArrayList<>();

       // grades.add(98);
       // System.out.println("Add grade " + 98);
       // grades.add(99);
       // System.out.println("Add grade " + 99);

       // grades.retainAll(addedGrades);
      //  System.out.println(grades);

        //get size of list
        double numberOfGrades = grades.size();
        System.out.println("Size of list: " + grades.size());

        // Calculate grade
        double average = sum/numberOfGrades;
        System.out.println("Grade average = : " + average );


    }
    }