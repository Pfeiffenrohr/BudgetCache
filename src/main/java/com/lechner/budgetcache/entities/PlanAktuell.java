package com.lechner.budgetcache.entities;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name="plan_aktuell")
public class PlanAktuell {

    @Id
    private Integer id;
    @Column(name="plan_id")
    private Integer planId;
    private Date datum;
    private Date zeit;
    private Integer kategorie;
    private Integer inwork;
    private Integer duration;

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

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getZeit() {
        return zeit;
    }

    public void setZeit(Date zeit) {
        this.zeit = zeit;
    }

    public Integer getKategorie() {
        return kategorie;
    }

    public void setKategorie(Integer kategorie) {
        this.kategorie = kategorie;
    }

    public Integer getInwork() {
        return inwork;
    }

    public void setInwork(Integer inwork) {
        this.inwork = inwork;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
