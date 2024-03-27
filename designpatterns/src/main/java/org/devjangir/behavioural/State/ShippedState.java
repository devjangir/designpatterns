package org.devjangir.behavioural.State;

public class ShippedState implements State {
    @Override
    public void next(Shipping shipping) {
        shipping.setState(new InTransitState());
    }

    @Override
    public void prev(Shipping shipping) {
        shipping.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Shipped State");
    }
}
