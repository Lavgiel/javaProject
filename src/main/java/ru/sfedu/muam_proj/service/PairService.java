package ru.sfedu.muam_proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.muam_proj.model.Pair;
import ru.sfedu.muam_proj.repository.PairRepository;
import ru.sfedu.muam_proj.repository.UserRepository;

import java.util.List;

@Service
public class PairService {
    @Autowired
    private PairRepository pairRepository;

    public Pair getById(long id) { return pairRepository.getById(id); }

    public List<Pair> getAll(){
        return pairRepository.findAll();
    }

    public Pair savePair(Pair pair){
        return pairRepository.save(pair);
    }

    public void deleteById(long id){
        pairRepository.deleteById(id);
    }
}
