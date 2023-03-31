package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    //Index parameter
    @Query("Select e from Etudiant e where e.nomE =?1 and e.prenomE =?2 ")
    Etudiant getEtudiantByNomPrenom (String nom, String prenom);

    //Named parameter
    @Query("Select e from Etudiant e where e.nomE =:nom and e.prenomE =:prenom ")
    Etudiant getEtudiantByNomPrenom2 (@Param("prenom") String prenom,@Param("nom") String nom);


}
