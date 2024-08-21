package de.devilsoft.warehouse_api.response;

import java.time.Instant;

import de.devilsoft.warehouse_api.model.DatabaseConnectionState;

public class HealthCheckResponse {
    private DatabaseConnectionState databaseState;
    private Instant timestamp;

    public DatabaseConnectionState getDatabaseState() {
        return databaseState;
    }

    public void setDatabaseState(DatabaseConnectionState databaseState) {
        this.databaseState = databaseState;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
