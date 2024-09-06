package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class ValidAnagram implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String anagram = "anagram";
        String text = "nagaram";

        boolean isAnagram = isAnagram(anagram, text);
        System.out.println(isAnagram);
    }

    private boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        for (int i = 0; i < s.length(); i++) {
            isAnagram = false;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    isAnagram = true;
                }

                isAnagram = false;
                break;
            }

            if (!isAnagram) {
                break;
            }
        }

        return isAnagram;
    }
}
