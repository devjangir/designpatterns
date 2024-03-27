package org.devjangir.behavioural.State;

public class InTransitState implements State {
    @Override
    public void next(Shipping shipping) {
        shipping.setState(new DeliveredState());
    }

    @Override
    public void prev(Shipping shipping) {
        shipping.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("In Transit State");
    }
}
