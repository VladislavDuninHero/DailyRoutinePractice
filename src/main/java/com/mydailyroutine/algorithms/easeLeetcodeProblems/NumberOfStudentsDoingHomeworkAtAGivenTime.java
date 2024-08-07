package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class NumberOfStudentsDoingHomeworkAtAGivenTime implements AlgosActionDispatcher {

    //Description:
    //Given two integer arrays startTime and endTime and given an integer queryTime.
    //
    //The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
    //
    //Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
    //
    //
    //
    //Example 1:
    //
    //Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
    //Output: 1
    //Explanation: We have 3 students where:
    //The first student started doing homework at time 1 and finished at time 3 and wasn't doing anything at time 4.
    //The second student started doing homework at time 2 and finished at time 2 and also wasn't doing anything at time 4.
    //The third student started doing homework at time 3 and finished at time 7 and was the only student doing homework at time 4.

    @Override
    public void execute() {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;

        System.out.println(busyStudent(startTime, endTime, queryTime));
    }


    //Beat 100% of other submissions' runtime.
    private int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int studentsCounter = 0;

        int pointerInStartTime = 0;
        int pointerInEndTime = 0;

        while (pointerInStartTime < startTime.length || pointerInEndTime < endTime.length) {
            if (startTime[pointerInStartTime] <= queryTime && endTime[pointerInEndTime] >= queryTime) {
                studentsCounter++;
            }

            pointerInStartTime++;
            pointerInEndTime++;
        }

        return studentsCounter;
    }
}
