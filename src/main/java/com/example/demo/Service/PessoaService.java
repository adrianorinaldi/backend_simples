package com.example.demo.Service;

import com.example.demo.Entity.PessoaEntity;
import com.example.demo.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {


    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaEntity> buscarTodos() {
        Sort sortById = Sort.by(Sort.Direction.ASC, "id");
        return pessoaRepository.findAll(sortById);
    }
}
