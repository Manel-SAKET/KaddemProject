package tn.aymax.saptechnique.kaddemproject.Services;
import tn.aymax.saptechnique.kaddemproject.entities.Etudiant;

import java.util.List;
import java.util.Optional;


public interface IEtudiantServices {
    List<Etudiant> retreiveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Optional<Etudiant> retreiveEtudiant (int idEtudiant);
    void removeEtudiant(int idEtudiant);
    public void assignEtudiantToDepartement (int etudiantId , int departementId );
}
