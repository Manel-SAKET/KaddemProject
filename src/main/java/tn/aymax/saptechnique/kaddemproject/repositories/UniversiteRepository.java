package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
}
