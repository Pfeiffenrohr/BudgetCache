package com.lechner.budgetcache.entities;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name="plan_cache")
public class PlanCache {
    @Id
    private Integer id;
    private Integer planId;
    private Integer kategorieId;
    private Date datum;
    private Double wert;
    private Double initial;
    private Date initial_datum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getKategorieId() {
        return kategorieId;
    }

    public void setKategorieId(Integer kategorieId) {
        this.kategorieId = kategorieId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public Double getInitial() {
        return initial;
    }

    public void setInitial(Double initial) {
        this.initial = initial;
    }

    public Date getInitial_datum() {
        return initial_datum;
    }

    public void setInitial_datum(Date initial_datum) {
        this.initial_datum = initial_datum;
    }
}
