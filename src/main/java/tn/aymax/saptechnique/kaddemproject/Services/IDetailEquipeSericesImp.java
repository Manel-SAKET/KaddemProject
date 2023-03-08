package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.DetailEquipe;
import tn.aymax.saptechnique.kaddemproject.repositories.DetailEquipeRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class IDetailEquipeSericesImp implements IDetailEquipeServices{
    private final DetailEquipeRepository detailEquipeRepository;

    @Override
    public List<DetailEquipe> retrieveAllDetailsEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public Optional<DetailEquipe> retrieveDetailEquipe(Integer idDetailEquipe) {
        return detailEquipeRepository.findById(idDetailEquipe);
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe de) {
        return detailEquipeRepository.save(de);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe de) {
        return detailEquipeRepository.save(de);
    }

    @Override
    public void removeDetailEquipe(Integer idDetailEquipe) {
        detailEquipeRepository.deleteById(idDetailEquipe);
    }
}
