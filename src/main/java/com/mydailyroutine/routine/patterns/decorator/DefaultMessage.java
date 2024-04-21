package com.mydailyroutine.routine.patterns.decorator;

public class DefaultMessage implements Message {
    private static final String DEFAULT_FIRST_PART = "hello";
    private static final String DEFAULT_SECOND_PART = "world";

    @Override
    public String getFirstPart() {
        return DEFAULT_FIRST_PART;
    }

    @Override
    public String getSecondPart() {
        return DEFAULT_SECOND_PART;
    }
}
