package com.mydailyroutine.algorithms.easeLeetcodeProblems;

public class Palindrome {

    private boolean isPal = false;

    public boolean isPalindrome(String s) {

        if (s.isEmpty() || s.isBlank() || s.length() == 1) {
            return true;
        }

        StringBuilder newStringBuilder = new StringBuilder();
        isPal = newStringBuilder.length() == 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                newStringBuilder.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            isPal = true;
        }

        findLettersInWord(newStringBuilder);


        return isPal;
    }

    private void findLettersInWord(StringBuilder newStringBuilder) {
        int head = 0;
        int tail = newStringBuilder.length() - 1;


        System.out.println(newStringBuilder);

        while (head <= tail && newStringBuilder.length() > 1) {
            if (newStringBuilder.charAt(head) == newStringBuilder.charAt(tail)) {
                head++;
                tail--;
                isPal = true;
            } else {
                isPal = false;
                break;
            }
        }
    }
}
