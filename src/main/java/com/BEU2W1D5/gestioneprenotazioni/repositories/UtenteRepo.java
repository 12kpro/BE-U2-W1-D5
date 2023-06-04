package com.BEU2W1D5.gestioneprenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UtenteRepo extends JpaRepository<com.BEU2W1D5.gestioneprenotazioni.entities.Utente, UUID> {

}
