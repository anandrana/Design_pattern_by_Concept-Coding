package ChainResponsiblityDesignPattern;

public class Main {

    public static void main(String[] args) {

        LogProcessor logProcessor=new InfoLogProcessor(
                new ErrorLogProcessor(new DebugLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "exception happen");
        logProcessor.log(LogProcessor.DEBUG, "need to debug this");
        logProcessor.log(LogProcessor.INFO, "just for info");
    }
}
