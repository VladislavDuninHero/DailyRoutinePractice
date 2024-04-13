package com.mydailyroutine.algorithms;

public class ReverseStringInPlace implements AlgosActionDispatcher {
    private String helloWorld = "helloWorld";
    private StringBuilder reverse = new StringBuilder();
    public void execute() {
        char[] arrayFromString = helloWorld.toCharArray();

        reverseString(arrayFromString);

        for (int i = 0; i < arrayFromString.length; i++) {
            reverse.append(arrayFromString[i]);
        }

        System.out.println(reverse.toString());
    }

    private void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
