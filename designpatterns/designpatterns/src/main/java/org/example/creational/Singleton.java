package org.example.creational;

class DLogger {

    private static DLogger instance;
    private DLogger() {}

    public static DLogger getInstance() {
        if(instance == null) {
            // add another check for double checking locking
            synchronized (DLogger.class) {
                if(instance == null) {
                    instance = new DLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
public class Singleton {
    public static void main(String[] args) {
        DLogger logger = DLogger.getInstance();
        DLogger logger2 = DLogger.getInstance();
        logger.log("Hello world!");
        logger2.log("Hello world!");
        System.out.println(logger == logger2);
    }
}
