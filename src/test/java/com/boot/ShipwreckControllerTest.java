package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jzl639 on 12/3/17.
 */
public class ShipwreckControllerTest {

    @Test
    public void testShipwreckGet() {
        ShipwreckController shipwreckController = new ShipwreckController();
        Shipwreck shipwreck = shipwreckController.get(1L);
        assertEquals(1l, shipwreck.getId().longValue());
    }
}
