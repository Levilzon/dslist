package com.cursodevsuperior.dslist.DTO;

import com.cursodevsuperior.dslist.entidades.Jogos;
import com.cursodevsuperior.dslist.projection.JogosMinProjection;

import java.util.Objects;

public class JogosMinDTO {
    private Long jogos_Id;
    private String nome;
    private int ano;
    private String genero;
    private String plataformas;
    private String imgURL;
    private String descricaoResumida;

    public JogosMinDTO(Jogos entity){
        this.jogos_Id = entity.getId();
        this.nome = entity.getNome();
        this.ano = entity.getAno();
        this.genero = entity.getGenero();
        this.plataformas = entity.getPlataformas();
        this.imgURL = entity.getImgURL();
        this.descricaoResumida = entity.getDescricaoRsumida();
    }

    public JogosMinDTO(JogosMinProjection projection){
        this.jogos_Id = projection.getJogosId();
        this.nome = projection.getTitle();
        this.ano = projection.getYear();
        this.imgURL = projection.getImgURL();
        this.descricaoResumida = projection.getShortDescription();
    }
    public Long getId(){
        return jogos_Id;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JogosMinDTO that = (JogosMinDTO) o;
        return Objects.equals(jogos_Id, that.jogos_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(jogos_Id);
    }
}
