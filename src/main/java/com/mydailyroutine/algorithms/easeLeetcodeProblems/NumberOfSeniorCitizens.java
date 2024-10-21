package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

//Description:
//You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
//
//The first ten characters consist of the phone number of passengers.
//The next character denotes the gender of the person.
//The following two characters are used to indicate the age of the person.
//The last two characters determine the seat allotted to that person.
//Return the number of passengers who are strictly more than 60 years old.
//
//
//
//Example 1:
//
//Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
//Output: 2
//Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.

public class NumberOfSeniorCitizens implements AlgosActionDispatcher {
    @Override
    public void execute() {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};

        int countSeniorCitizens = countSeniors(details);

        System.out.println(countSeniorCitizens);
    }

    //Runtime: beats 80% of other solutions.
    //Memory: beats 13% of other solutions.
    private int countSeniors(String[] details) {

        int count = 0;

        for (int i = 0; i < details.length; i++) {

            StringBuilder builder = new StringBuilder();

            for (int j = 11; j < 13; j++) {
                builder.append(details[i].charAt(j));
            }

            if (Integer.parseInt(builder.toString()) > 60) {
                count++;
            }
        }


        return count;
    }
}
