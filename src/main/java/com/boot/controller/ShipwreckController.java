package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jzl639 on 12/3/17.
 */
@RestController
@RequestMapping("api/v1")
public class ShipwreckController {

    @Autowired
    private CounterService counterService;

    @Autowired
    private GaugeService gaugeService;

    @RequestMapping(value="shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        counterService.increment("get.shipwrecks");
        gaugeService.submit("get.last.shipwrecks", System.currentTimeMillis());
        return ShipwreckStub.list();
    }

    @RequestMapping(value="shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.create(shipwreck);

    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id ) {
        return ShipwreckStub.get(id);

    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck get(@PathVariable Long id, @RequestBody Shipwreck shipwreck ) {
        return ShipwreckStub.update(id, shipwreck);

    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id ) {
        return ShipwreckStub.delete(id);

    }



}
