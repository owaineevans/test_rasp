package com.aa.canbus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CanBusTest {
    private CanBus canBus;

    @BeforeEach
    public void beforeEach() {
        canBus = new CanBus();
    }

    @Test
    public void doSomethingTest() {
        org.junit.Assert.assertEquals("tick 0", canBus.doSomething());
        org.junit.Assert.assertEquals("tick 1", canBus.doSomething());
    }

}