package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Contrat;

import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    @Query(value = "select c from Contrat c where archive ='false' and dateFinContrat-sysdate<=15 ", nativeQuery = true)
    List<Contrat> getContratsexpirantdans15jours();
}
