package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.List;

public class DecodeTheMessage implements AlgosActionDispatcher {

    @Override
    public void execute() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
    }

    private String decodeMessage(String key, String message) {
        String[] splitKey = key.split("");
        List<String> alphabet = List.of(
                "A", "B", "C", "D", "E",
                "F", "G", "H", "I",
                "J", "K", "L", "M",
                "N", "O", "P", "Q",
                "R", "S", "T", "U",
                "V", "W", "X", "Y",
                "Z"
        );


        return null;
    }
}
