package com.cursodevsuperior.dslist.controlador;

import com.cursodevsuperior.dslist.entidades.Jogos;
import com.cursodevsuperior.dslist.entidades.JogosMinDTO;
import com.cursodevsuperior.dslist.servicos.JogoServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class JogosControlador {
    @Autowired
    private JogoServicos jogoServicos;

    @GetMapping("/lista")
    public List<JogosMinDTO> findAll(){
        List<JogosMinDTO> result = jogoServicos.findAll();
        return result;
    }

}
