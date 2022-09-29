package com.lechner.budgetcache.entities;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name="tmp_update")
public class TmpUpdate {
    @Id
    private Integer id;
    private Date datum;
    private Integer kategorie;
    private Integer konto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getKategorie() {
        return kategorie;
    }

    public void setKategorie(Integer kategorie) {
        this.kategorie = kategorie;
    }

    public Integer getKonto() {
        return konto;
    }

    public void setKonto(Integer konto) {
        this.konto = konto;
    }
}
