package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by jzl639 on 12/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipwreckControllerTest {

    @InjectMocks
    ShipwreckController sc;

    @Test
    public void testShipwreckGet() {
//        ShipwreckController shipwreckController = new ShipwreckController();
//        Shipwreck shipwreck = shipwreckController.get(1L);
        Shipwreck shipwreck = sc.get(1L);
        assertEquals(1l, shipwreck.getId().longValue());
    }
}
