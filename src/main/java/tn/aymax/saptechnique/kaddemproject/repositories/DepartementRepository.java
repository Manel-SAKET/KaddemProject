package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}
