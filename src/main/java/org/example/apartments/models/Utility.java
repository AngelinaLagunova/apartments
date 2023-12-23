package org.example.apartments.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Utility {
    @Id
    private Integer id;

    private String name;
    private String Unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public Float getTariff() {
        return tariff;
    }

    public void setTariff(Float tariff) {
        this.tariff = tariff;
    }

    private Float tariff;

}
