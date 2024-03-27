package org.devjangir.behavioural.State;

public class Shipping {
    private State state;

    public Shipping() {
        state = new ShippedState();
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
