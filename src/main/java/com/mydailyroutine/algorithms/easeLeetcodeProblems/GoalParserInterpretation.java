package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class GoalParserInterpretation implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String goal = "G()()()()(al)";

        //Main solution
        String interpretation = interpret(goal);

        //Other solution
        String easeInterpretation = easeInterpret(interpretation);

        System.out.println(interpretation);
        System.out.println(easeInterpretation);
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 80% of other solutions.
    private String interpret(String command) {

        StringBuilder builder = new StringBuilder();

        char[] commandArray = command.toCharArray();

        for (int i = 0; i < commandArray.length; i++) {
            if (commandArray[i] == '(' && commandArray[i + 1] == ')') {
                builder.append("o");
            }

            if (commandArray[i] == '(' && commandArray[i + 1] != ')') {
                builder.append("al");
            }

            if (commandArray[i] == 'G') {
                builder.append("G");
            }
        }

        return builder.toString();
    }

    //Runtime: beats 60% of other solutions.
    //Memory: beats 80% of other solutions.
    private String easeInterpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;
    }
}
