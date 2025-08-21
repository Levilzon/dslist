package com.cursodevsuperior.dslist.controlador;

import com.cursodevsuperior.dslist.DTO.ListaDeJogosDTO;
import com.cursodevsuperior.dslist.servicos.ListaDeJogosServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListaDeJogosControlador {

    @Autowired
    private ListaDeJogosServicos listaDeJogosServicos;

    @GetMapping("")
    public List<ListaDeJogosDTO> findAll(){
        List<ListaDeJogosDTO> result = listaDeJogosServicos.findAll();
        return result;
    }

}
