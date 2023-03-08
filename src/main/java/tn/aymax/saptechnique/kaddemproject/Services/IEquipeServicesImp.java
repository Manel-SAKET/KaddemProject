package tn.aymax.saptechnique.kaddemproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.aymax.saptechnique.kaddemproject.entities.Equipe;
import tn.aymax.saptechnique.kaddemproject.repositories.EquipeRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IEquipeServicesImp implements IEquipeServices{
    public final EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);

    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Optional<Equipe> retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe);
    }
}
