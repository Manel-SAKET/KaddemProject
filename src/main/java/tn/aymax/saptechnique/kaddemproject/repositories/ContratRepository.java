package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {
}
