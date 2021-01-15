package com.arca.testhabeeb.data.entities;

import com.arca.framework.data.entities.BaseEntityWithId;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TestHabeeb extends BaseEntityWithId {

    @Column
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
