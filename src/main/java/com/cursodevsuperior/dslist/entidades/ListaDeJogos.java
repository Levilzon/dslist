package com.cursodevsuperior.dslist.entidades;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name ="tb_game_list")
public class ListaDeJogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lista_Id;
    @Column(name = "title")
    private String nome;

    public ListaDeJogos(){

    }
    public ListaDeJogos(Long id, String nome){
        this.lista_Id = id;
        this.nome = nome;
    }

    public Long getId(){
        return lista_Id;
    }
    public void setId(Long id){
        this.lista_Id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListaDeJogos that = (ListaDeJogos) o;
        return Objects.equals(lista_Id, that.lista_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lista_Id);
    }
}
