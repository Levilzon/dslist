package com.cursodevsuperior.dslist.entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jogos_Id;
    @Column(name = "title")
    private String nome;
    @Column(name = "game_year")
    private int ano;
    @Column(name = "genre")
    private String genero;
    @Column(name = "platforms")
    private String plataformas;
    @Column(name = "score")
    private double pontuacao;
    @Column(name = "img_url")
    private String imgURL;
    @Column(name = "short_description")
    private String descricaoResumida;
    @Column(name = "long_description",columnDefinition = "TEXT")
    private String descricaoDetalhada;

    public Jogos(){

    }
    public Jogos(Long id, String nome, int ano, String genero, String plataformas, double pontuacao, String imgURL, String descricaoResumida, String descricaoDetalhada){
        this.jogos_Id = id;
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.plataformas = plataformas;
        this.pontuacao = pontuacao;
        this.imgURL = imgURL;
        this.descricaoResumida = descricaoResumida;
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public Long getId(){
        return jogos_Id;
    }

    public void setId(Long id){
        this.jogos_Id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getPlataformas(){
        return plataformas;
    }
    public void setPlataformas(String plataformas){
        this.plataformas = plataformas;
    }
    public double getPontuacao(){
        return pontuacao;
    }
    public void setPontuacao(double pontuacao){
        this.pontuacao = pontuacao;
    }
    public String getImgURL(){
        return imgURL;
    }
    public void setImgURL(String imgURL){
        this.imgURL = imgURL;
    }
    public String getDescricaoRsumida(){
        return descricaoResumida;
    }
    public void setDescricaoResumida(String descricaoResumida){
        this.descricaoResumida= descricaoResumida;
    }
    public String getDescricaoDetalhada(){
        return descricaoDetalhada;
    }
    public void setDescricaoDetalhada(String descricaoDetalhada){
        this.descricaoDetalhada = descricaoDetalhada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogos jogos = (Jogos) o;
        return Objects.equals(jogos_Id, jogos.jogos_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(jogos_Id);
    }
}
