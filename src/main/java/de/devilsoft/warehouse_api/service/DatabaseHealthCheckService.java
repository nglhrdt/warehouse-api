package de.devilsoft.warehouse_api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.devilsoft.warehouse_api.model.DatabaseConnectionState;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class DatabaseHealthCheckService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public DatabaseConnectionState getDatabaseState() {
        try {
            entityManager.createNativeQuery("SELECT 1").getSingleResult();
            return DatabaseConnectionState.CONNECTED;
        } catch (Exception e) {
            return DatabaseConnectionState.OFFLINE;
        }
    }
}
