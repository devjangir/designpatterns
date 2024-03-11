package org.example.creational;

// Singleton using Enum
enum DLoggerEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class SingletonUsingEnum {
    public static void main(String[] args) {
        DLoggerEnum logger = DLoggerEnum.INSTANCE;
        DLoggerEnum logger2 = DLoggerEnum.INSTANCE;
        logger.setValue(2);
        logger2.setValue(3);
        System.out.println(logger.getValue());
        System.out.println(logger2.getValue());
        System.out.println(logger == logger2);
    }
}
