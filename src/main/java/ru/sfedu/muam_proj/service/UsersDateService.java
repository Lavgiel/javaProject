package ru.sfedu.muam_proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.muam_proj.model.Pair;
import ru.sfedu.muam_proj.model.UsersDate;
import ru.sfedu.muam_proj.repository.PairRepository;
import ru.sfedu.muam_proj.repository.UsersDateRepository;

import java.util.List;

@Service
public class UsersDateService {
    @Autowired
    private UsersDateRepository usersDateRepository;

    public UsersDate getById(long id) { return usersDateRepository.getById(id); }

    public List<UsersDate> getAll(){
        return usersDateRepository.findAll();
    }

    public UsersDate saveDate(UsersDate usersDate){
        return usersDateRepository.save(usersDate);
    }

    public void deleteById(long id){
        usersDateRepository.deleteById(id);
    }
}
