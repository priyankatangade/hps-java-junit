package com.coffeemachine;

import junit.framework.TestCase;

public class ShutdownTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testShutdownMachine() {
        actionwords.pressOnoffButtonToStartTheMachine();
        actionwords.checkThatMachineIsStarted();
    }
}