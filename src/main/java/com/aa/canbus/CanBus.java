package com.aa.canbus;

/**
 * This is the class that gets the canbus messages from the hardware layer
 */
public class CanBus extends Thread {

    private Integer number = 0;

    @Override
    public void run() {
        while (!interrupted()) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tick " + number++);
        }
    }

    public String doSomething() {
        return "tick " + number++;
    }
}