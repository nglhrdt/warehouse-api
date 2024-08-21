package de.devilsoft.warehouse_api.controller;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.devilsoft.warehouse_api.model.DatabaseConnectionState;
import de.devilsoft.warehouse_api.response.HealthCheckResponse;
import de.devilsoft.warehouse_api.service.DatabaseHealthCheckService;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

    @Autowired
    private DatabaseHealthCheckService databaseHealthCheckService;

    @GetMapping
    public HealthCheckResponse healthCheck() {
        final DatabaseConnectionState databaseState = databaseHealthCheckService.getDatabaseState();
        final Instant timestamp = Instant.now();

        final HealthCheckResponse response = new HealthCheckResponse();
        response.setDatabaseState(databaseState);
        response.setTimestamp(timestamp);

        return response;
    }
}
