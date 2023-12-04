package com.amal.portabilite.service.impl;


import com.amal.portabilite.model.Demande;
import com.amal.portabilite.repositories.DemandeRepository;
import com.amal.portabilite.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeServiceImpl implements DemandeService {

    @Autowired
    private DemandeRepository demandeRepository;

    @Override
    public Demande addDemande(Demande demande) {
        return demandeRepository.save(demande);
    }

    @Override
    public Demande updateDemande(Demande demande) {
        return demandeRepository.save(demande);
    }

    @Override
    public List<Demande> getDemandes() {
        return demandeRepository.findAll();
    }

    @Override
    public Demande getDemande(Long demandeId) {
        return demandeRepository.findById(demandeId).get();
    }

    @Override
    public void deleteDemande(Long demandeId) {
        Demande demande = new Demande();
        demande.setDemandeId(demandeId);
        demandeRepository.delete(demande);
    }
}
