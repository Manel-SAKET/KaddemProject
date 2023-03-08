package tn.aymax.saptechnique.kaddemproject.Services;

import tn.aymax.saptechnique.kaddemproject.entities.DetailEquipe;

import java.util.List;
import java.util.Optional;

public interface IDetailEquipeServices {
    DetailEquipe addDetailEquipe(DetailEquipe de);
    DetailEquipe updateDetailEquipe(DetailEquipe de);
    List<DetailEquipe> retrieveAllDetailsEquipe();
    void removeDetailEquipe(Integer idDetailEquipe);
    public Optional<DetailEquipe> retrieveDetailEquipe(Integer idDetailEquipe);
}
