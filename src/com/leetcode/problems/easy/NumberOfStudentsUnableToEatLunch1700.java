package com.leetcode.problems.easy;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class NumberOfStudentsUnableToEatLunch1700 {
    public static void main(String[] args) {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};

        System.out.println(countStudents(students, sandwiches));

        int[] students2 = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = new int[]{1, 0, 0, 0, 1, 1};

        System.out.println(countStudents(students2, sandwiches2));

        int[] students3 = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches3 = new int[]{1, 0, 0, 0, 1, 1};

        System.out.println(countStudentsWithoutStackAndQueue(students3, sandwiches3));
    }


    //The number of sandwiches in the cafeteria is equal to the number of students.
    // The sandwiches are placed in a stack. At each step:
    //
    //If the student at the front of the queue prefers the sandwich on the top of the stack,
    // they will take it and leave the queue.
    //Otherwise, they will leave it and go to the queue's end.
    //This continues until none of the queue students want to take the top sandwich and are thus unable to eat.

    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwichesStack = new Stack<>();
        for (int j = sandwiches.length - 1; j >= 0; j--) {
            sandwichesStack.push(sandwiches[j]);
        }

        Queue<Integer> studentsQueue = new ArrayDeque<>();
        for (int student : students) {
            studentsQueue.add(student);
        }

        int studentsOffered = students.length;

        while (!studentsQueue.isEmpty() && !sandwichesStack.isEmpty() && studentsOffered != 0) {
            if (Objects.equals(studentsQueue.peek(), sandwichesStack.peek())) {
                studentsQueue.poll();
                sandwichesStack.pop();
                studentsOffered = studentsQueue.size();
            } else {
                Integer currentStudent = studentsQueue.poll();
                studentsQueue.add(currentStudent);
                studentsOffered--;
            }

        }

        return studentsQueue.size();
    }

    public static int countStudentsWithoutStackAndQueue(int[] students, int[] sandwiches) {
        int circleStudentsCount = 0;
        int squareStudentsCount = 0;

        for (int i = 0; i < students.length; i++) {
            if(students[i] == 0) {
                circleStudentsCount++;
            } else {
                squareStudentsCount++;
            }
        }

        for(int sandwich : sandwiches) {
            if(sandwich == 0) {
                if(circleStudentsCount == 0) {
                    break;
                }
                circleStudentsCount--;
            } else {
                if(squareStudentsCount == 0) {
                    break;
                }
                squareStudentsCount--;
            }
        }



        return circleStudentsCount + squareStudentsCount;
    }
}
