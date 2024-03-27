package org.devjangir.behavioural.State;

public class Main {
    public static void main(String[] args) {
        Shipping shipping = new Shipping();
        shipping.getState().printStatus();
        shipping.next();
        shipping.getState().printStatus();
        shipping.next();
        shipping.getState().printStatus();
        shipping.next();
        shipping.getState().printStatus();
        shipping.prev();
        shipping.getState().printStatus();
    }
}
