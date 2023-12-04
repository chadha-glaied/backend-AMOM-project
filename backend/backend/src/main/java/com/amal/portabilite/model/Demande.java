package com.amal.portabilite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "demandes")
public class  Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long demandeId;
    private int rio;
    private int numero;
   private Date datec;
   private Date datep;

    @OneToMany(mappedBy = "demande",cascade = CascadeType.ALL)
    @JsonIgnore


    public Long getDemandeId() {
        return demandeId;
    }

    public void setDemandeId(Long demandeId) {
        this.demandeId = demandeId;
    }

    public int getRio() {
        return rio;
    }

    public void setRio(int rio) {
        this.rio = rio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDatec() {
        return datec;
    }

    public void setDatec(Date datec) {
        this.datec = datec;
    }
    public Date getDatep() {
        return datep;
    }
    public void setDatep(Date datep) {
        this.datep = datep;
    }

    public Demande(){
    }
}
