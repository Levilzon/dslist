package com.cursodevsuperior.dslist.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_GAME")
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Jogos(Long id, String nome, int ano, String genero, String plataformas, double pontuacao, String imgURL, String descricaoResumida, String descricaoDetalhada){
        this.id = id;
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
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getPlataformas(){
        return this.plataformas;
    }
    public void setPlataformas(String plataformas){
        this.plataformas = plataformas;
    }
    public double getPontuacao(){
        return this.pontuacao;
    }
    public void setPontuacao(double pontuacao){
        this.pontuacao = pontuacao;
    }
    public String getImgURL(){
        return this.imgURL;
    }
    public void setImgURL(String imgURL){
        this.imgURL = imgURL;
    }
    public String getDescricaoRsumida(){
        return this.descricaoResumida;
    }
    public void setDescricaoResumida(String descricaoResumida){
        this.descricaoResumida= descricaoResumida;
    }
    public String getDescricaoDetalhada(){
        return this.descricaoDetalhada;
    }
    public void setDescricaoDetalhada(String descricaoDetalhada){
        this.descricaoDetalhada = descricaoDetalhada;
    }

}
