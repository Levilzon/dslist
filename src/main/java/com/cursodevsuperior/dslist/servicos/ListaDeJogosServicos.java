package com.cursodevsuperior.dslist.servicos;

import com.cursodevsuperior.dslist.DTO.ListaDeJogosDTO;
import com.cursodevsuperior.dslist.entidades.ListaDeJogos;
import com.cursodevsuperior.dslist.repositorio.ListaDeJogosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListaDeJogosServicos {
    @Autowired
    private ListaDeJogosRepositorio listaDeJogosRepositorio;

    public List<ListaDeJogosDTO>findAll(){
        List<ListaDeJogos> result = listaDeJogosRepositorio.findAll();
        List<ListaDeJogosDTO> dto = result.stream().map(x -> new ListaDeJogosDTO(x)).toList();
        return dto;
    }
}
