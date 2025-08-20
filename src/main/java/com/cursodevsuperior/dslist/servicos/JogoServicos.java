package com.cursodevsuperior.dslist.servicos;

import com.cursodevsuperior.dslist.entidades.Jogos;
import com.cursodevsuperior.dslist.entidades.JogosMinDTO;
import com.cursodevsuperior.dslist.repositorio.JogoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoServicos {
    @Autowired
    private JogoRepositorio jogosRepositorio;

    public List<JogosMinDTO>findAll(){
        List<Jogos> result = jogosRepositorio.findAll();
        List<JogosMinDTO> dto = result.stream().map(x -> new JogosMinDTO(x)).toList();
        return dto;
    }
}
