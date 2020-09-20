package com.coffeemachine.display_errors;

import junit.framework.TestCase;
import com.coffeemachine.Actionwords;

public class DescalingTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
    //
    // Tags: sprint:4
    public void testDescalingNeededAfter500Coffees() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // And I handle water tank
        actionwords.iHandleWaterTank();
        // And I handle beans
        actionwords.iHandleBeans();
        // And I handle coffee grounds
        actionwords.iHandleCoffeeGrounds();
        // When I take "500" coffees
        actionwords.iTakeCoffeeNumberCoffees("500");
        // Then warning "Coffee warning will be descaled" displayed
        actionwords.warningP1Displayed("Coffee warning will be descaled");
    }
}