package com.cursodevsuperior.dslist.entidades;

import jakarta.persistence.Column;

public class JogosMinDTO {
    private Long id;
    private String nome;
    private int ano;
    private String genero;
    private String plataformas;
    private String imgURL;
    private String descricaoResumida;

    public JogosMinDTO(Jogos entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.ano = entity.getAno();
        this.genero = entity.getGenero();
        this.plataformas = entity.getPlataformas();
        this.imgURL = entity.getImgURL();
        this.descricaoResumida = entity.getDescricaoRsumida();
    }

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public int getAno(){
        return ano;
    }
    public String getGenero(){
        return genero;
    }
    public String getPlataformas(){
        return plataformas;
    }
    public String getImgURL(){
        return imgURL;
    }
    public String getDescricaoResumida(){
        return descricaoResumida;
    }
}
