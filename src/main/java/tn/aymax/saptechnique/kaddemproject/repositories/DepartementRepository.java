package tn.aymax.saptechnique.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.aymax.saptechnique.kaddemproject.entities.Departement;

import java.util.List;

//inutile d'ajouter @Repo
public interface DepartementRepository extends JpaRepository<Departement,Integer> {

    @Query("Select u.departements from Universite u where u.nomUniv=?1")
    List<Departement> getAllDepartsByNomUniv(String nomU);

    @Query(value = "select * from departement d " +
            "inner join universite_departements ud " +
            "on ud.departements_id_depart = d.id_depart " +
            "inner join universite u " +
            "on u.id_univ = ud.universite_id_univ " +
            "where u.nom_univ =?1", nativeQuery = true)
    List<Departement> getAllDepartsByNomUnivSQL(String nomU);

    @Query("Select d from Departement d order by size(d.etudiants) desc")
    List<Departement> getListDepartementsTrieesparEtudiants();

    @Query(value = "select * from departement d\n" +
            "order by (SELECT count(*) from etudiant e " +
            "WHERE d.id_depart = e.departement_id_depart);", nativeQuery = true)
    List<Departement> getListDepartementsTrieesparEtudiantsSQL();
}
