package com.boot.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jzl639 on 12/3/17.
 */
@Component
public class ShipwreckHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://www.amazon.com", String.class);
            return Health.up().build();
        } catch (Exception e) {
            return Health.down().withDetail("reason", e.getMessage()).build();
        }
    }
}
