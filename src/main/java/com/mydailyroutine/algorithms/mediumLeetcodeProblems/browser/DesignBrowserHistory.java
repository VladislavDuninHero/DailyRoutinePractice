package com.mydailyroutine.algorithms.mediumLeetcodeProblems.browser;


import lombok.Getter;

import java.util.ArrayList;

@Getter
public class DesignBrowserHistory {

    private final String homePage;
    private final ArrayList<String> history;
    private String currentPage;

    public DesignBrowserHistory(String homepage) {
        this.homePage = homepage;
        this.history = new ArrayList<>();
        this.history.add(homePage);
        this.currentPage = homePage;
    }

    public void visit(String url) {
        this.history.add(url);
        this.currentPage = url;
    }

    public String back(int steps) {
        if (history.size() == 1) {
            return homePage;
        }

        int index = history.indexOf(currentPage) - steps;
        currentPage = index < 0 ? history.get(index) : homePage;

        return currentPage;
    }

    public String forward(int steps) {
        if (history.size() == 1) {
            return homePage;
        }

        int index = history.indexOf(currentPage) + steps;
        currentPage = index > 0 ? history.get(index) : homePage;

        return currentPage;
    }
}
