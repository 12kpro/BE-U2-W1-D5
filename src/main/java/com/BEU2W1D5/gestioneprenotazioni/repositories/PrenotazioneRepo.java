package com.BEU2W1D5.gestioneprenotazioni.repositories;

import com.BEU2W1D5.gestioneprenotazioni.entities.Postazione;
import com.BEU2W1D5.gestioneprenotazioni.entities.Prenotazione;
import com.BEU2W1D5.gestioneprenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface PrenotazioneRepo extends JpaRepository<com.BEU2W1D5.gestioneprenotazioni.entities.Prenotazione, UUID> {
    Optional<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);


    Optional<Prenotazione> findByDataAndPostazione(LocalDate data, Postazione postazione);
}
