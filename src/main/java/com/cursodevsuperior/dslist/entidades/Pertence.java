package com.cursodevsuperior.dslist.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "belonging")
public class Pertence {
    @EmbeddedId
    private PertencePK id = new PertencePK();
    private int posicao;

    public Pertence(){

    }

    public Pertence(Jogos jogos, ListaDeJogos lista, int posicao){
        id.setJogos(jogos);
        id.setLista(lista);
        this.posicao = posicao;
    }
    public PertencePK getPertecenPK(){
        return id;
    }
    public void setPertencePK(PertencePK id){
        this.id = id;
    }
    public int getPosicao(){
        return posicao;
    }
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pertence pertence = (Pertence) o;
        return Objects.equals(id, pertence.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
