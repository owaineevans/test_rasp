package com.aa;

import com.aa.canbus.CanBus;

/**
 * A main class - will discuss what it's for in future.
 */
public class Main {
    private CanBus canBus;

    public Main() {
        canBus = new CanBus();
    }

    /**
     * Used for testing using a mocked CanBus object
     *
     * @param canBus - possibly a mocked CanBus object
     */
    public Main(CanBus canBus) {
        this.canBus = canBus;
    }

    public void run() {
        canBus.start();
    }
}
