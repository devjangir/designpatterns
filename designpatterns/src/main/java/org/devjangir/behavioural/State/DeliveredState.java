package org.devjangir.behavioural.State;

public class DeliveredState implements State {
    @Override
    public void next(Shipping shipping) {
        System.out.println("Already Delivered");
    }

    @Override
    public void prev(Shipping shipping) {
        shipping.setState(new InTransitState());
    }

    @Override
    public void printStatus() {
        System.out.println("Delivered State");
    }
}
