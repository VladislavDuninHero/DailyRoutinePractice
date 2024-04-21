package com.mydailyroutine.routine.patterns.decorator;

public class Decorator implements Message {
    private Message originalMessage;
    private String firstPart = "";
    private String secondPart = "";

    public Decorator(Message originalMessage) {
        this.originalMessage = originalMessage;
    }

    public Decorator(Message originalMessage, String firstPart, String secondPart) {
        this.originalMessage = originalMessage;
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    @Override
    public String getFirstPart() {
        return this.firstPart + originalMessage.getFirstPart();
    }

    @Override
    public String getSecondPart() {
        return originalMessage.getSecondPart() + this.secondPart;
    }

}
