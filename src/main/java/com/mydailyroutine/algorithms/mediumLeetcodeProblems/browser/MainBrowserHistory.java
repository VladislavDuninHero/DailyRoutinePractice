package com.mydailyroutine.algorithms.mediumLeetcodeProblems.browser;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

public class MainBrowserHistory implements AlgosActionDispatcher {


    @Override
    public void execute() {
        String homePage = "google.com";
        String nextPoint = "youtube.com";
        String middlePoint = "facebook.com";

        DesignBrowserHistory designBrowserHistory = new DesignBrowserHistory(homePage);

        designBrowserHistory.visit(nextPoint);
        System.out.println(designBrowserHistory.getHistory());
        designBrowserHistory.visit(middlePoint);
        System.out.println(designBrowserHistory.getHistory());
        String currentUrlAfterBack = designBrowserHistory.back(1);
        String currentUrlAfterForward = designBrowserHistory.forward(1);

        System.out.println(designBrowserHistory);
        System.out.println(currentUrlAfterBack);
        System.out.println(currentUrlAfterForward);
    }

}
