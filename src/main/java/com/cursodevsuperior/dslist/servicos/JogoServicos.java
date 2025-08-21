package com.cursodevsuperior.dslist.servicos;

import com.cursodevsuperior.dslist.DTO.JogosDTO;
import com.cursodevsuperior.dslist.entidades.Jogos;
import com.cursodevsuperior.dslist.DTO.JogosMinDTO;
import com.cursodevsuperior.dslist.repositorio.JogoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JogoServicos {
    @Autowired
    private JogoRepositorio jogosRepositorio;

    @Transactional(readOnly = true)
    public JogosDTO findById(Long id){
        Jogos result = jogosRepositorio.findById(id).get();
        JogosDTO dto = new JogosDTO();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<JogosMinDTO>findAll(){
        List<Jogos> result = jogosRepositorio.findAll();
        List<JogosMinDTO> dto = result.stream().map(x -> new JogosMinDTO(x)).toList();
        return dto;
    }
}
