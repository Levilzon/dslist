package com.cursodevsuperior.dslist.DTO;

import com.cursodevsuperior.dslist.entidades.ListaDeJogos;

public class ListaDeJogosDTO {
    private Long lista_id;
    private String nome;

    public ListaDeJogosDTO(){

    }
    public ListaDeJogosDTO(ListaDeJogos entidade){
        this.lista_id = entidade.getId();
        this.nome = entidade.getNome();
    }
    public Long getId(){
        return lista_id;
    }
    public String getNome(){
        return nome;
    }
}
