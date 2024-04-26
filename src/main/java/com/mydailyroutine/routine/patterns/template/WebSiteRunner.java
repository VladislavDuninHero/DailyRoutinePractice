package com.mydailyroutine.routine.patterns.template;

public class WebSiteRunner {
    public static void main(String[] args) {
        AbstractMainClass webPageWithNavPanel = new WebPageWithNavPanel();
        webPageWithNavPanel.templateMethod();

        AbstractMainClass webPageWithMainContent = new WebPageWithMainContent();
        webPageWithMainContent.templateMethod();
    }
}
