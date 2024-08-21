package de.devilsoft.warehouse_api.entity;

import de.devilsoft.warehouse_api.model.StorageUnitType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StorageUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private StorageUnitType type;
    
    @OneToOne()
    private StorageUnit parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageUnitType getType() {
        return type;
    }

    public void setType(StorageUnitType type) {
        this.type = type;
    }

    public StorageUnit getParent() {
        return parent;
    }

    public void setParent(StorageUnit parent) {
        this.parent = parent;
    }
}
