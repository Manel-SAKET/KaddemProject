package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
