package com.amal.portabilite.service;

import com.amal.portabilite.model.Demande;

import java.util.List;
import java.util.Set;

public interface DemandeService {

    Demande addDemande(Demande demande);

    Demande updateDemande(Demande demande);

    List<Demande> getDemandes();

    Demande getDemande(Long demandeId);


    void deleteDemande(Long demandeId);
}
