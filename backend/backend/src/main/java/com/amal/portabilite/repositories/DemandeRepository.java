package com.amal.portabilite.repositories;

import com.amal.portabilite.model.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DemandeRepository extends JpaRepository<Demande,Long> {

}
