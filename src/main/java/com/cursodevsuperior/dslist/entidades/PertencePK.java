package com.cursodevsuperior.dslist.entidades;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
@Embeddable
public class PertencePK {
    @ManyToOne
    @JoinColumn(name = "game_Id")
    private Jogos jogos;
    @ManyToOne
    @JoinColumn(name = "list_Id")
    private ListaDeJogos lista;

    public PertencePK(){

    }
    public PertencePK(Jogos jogos, ListaDeJogos lista){
        this.jogos = jogos;
        this.lista = lista;
    }

    public Jogos getJogos(){
        return jogos;
    }
    public void setJogos(Jogos jogo){
        this.jogos = jogos;
    }
    public ListaDeJogos getLista(){
       return lista;
    }
    public void setLista(ListaDeJogos lista){
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PertencePK that = (PertencePK) o;
        return Objects.equals(jogos, that.jogos) && Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jogos, lista);
    }
}
