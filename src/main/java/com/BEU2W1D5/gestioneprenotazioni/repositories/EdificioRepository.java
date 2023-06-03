package com.BEU2W1D5.gestioneprenotazioni.repositories;

import com.BEU2W1D5.gestioneprenotazioni.entities.Edificio;
import com.BEU2W1D5.gestioneprenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
}