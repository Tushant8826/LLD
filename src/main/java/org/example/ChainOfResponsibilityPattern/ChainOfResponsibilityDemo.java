package org.example.ChainOfResponsibilityPattern;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(logProcessor.INFO,"just for info");
        logProcessor.log(logProcessor.DEBUG,"just for debug");
        logProcessor.log(logProcessor.ERROR,"just for error");
    }
}
