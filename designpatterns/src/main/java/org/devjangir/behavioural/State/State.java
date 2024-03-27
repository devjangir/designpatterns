package org.devjangir.behavioural.State;

public interface State {
    void next(Shipping shipping);
    void prev(Shipping shipping);
    void printStatus();
}
