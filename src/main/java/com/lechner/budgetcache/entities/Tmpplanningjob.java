package com.lechner.budgetcache.entities;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="tmpplanningjobs")
public class Tmpplanningjob {

    @Id
    private Integer id;
    @Column(name="plan_id")
    private String planId;
    private Integer kategorie;
    private Integer prio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlan_id() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Integer getKategorie() {
        return kategorie;
    }

    public void setKategorie(Integer kategorie) {
        this.kategorie = kategorie;
    }

    public Integer getPrio() {
        return prio;
    }

    public void setPrio(Integer prio) {
        this.prio = prio;
    }
}
