package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;


public class CapitalizeTheTitle implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String word = "capiTalIze tHe titLe";

        String capitalizeTitle = capitalizeTitle(word);

        System.out.println(capitalizeTitle);
    }

    private String capitalizeTitle(String title) {
        String toLower = title.toLowerCase();

        String[] splitWord = toLower.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < splitWord.length; i++) {
            if (splitWord[i].length() >= 3) {
                char[] chars =  splitWord[i].toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);

                if (i < splitWord.length - 1) {
                    builder.append(chars);
                    builder.append(" ");
                    continue;
                }

                builder.append(chars);
                continue;
            }


            if (i < splitWord.length - 1) {
                builder.append(splitWord[i]);
                builder.append(" ");
                continue;
            }

            builder.append(splitWord[i]);
        }

        return builder.toString();
    }
}
