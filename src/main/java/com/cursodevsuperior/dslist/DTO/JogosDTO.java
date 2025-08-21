package com.cursodevsuperior.dslist.DTO;

import com.cursodevsuperior.dslist.entidades.Jogos;
import org.springframework.beans.BeanUtils;

public class JogosDTO {
    private Long jogos_Id;
    private String nome;
    private int ano;
    private String genero;
    private String plataformas;
    private double pontuacao;
    private String imgURL;
    private String descricaoResumida;
    private String descricaoDetalhada;

    public JogosDTO(){

    }

    public JogosDTO(Jogos entidade){
        BeanUtils.copyProperties(entidade, this);
    }

    public Long getJogos_Id(){
        return jogos_Id;
    }
    public void setJogos_Id(Long jogos_Id){
        this.jogos_Id = jogos_Id;
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
    public String getDescricaoResumida(){
        return descricaoResumida;
    }
    public void setDescricaoResumida(String descricaoResumida){
        this.descricaoResumida = descricaoResumida;
    }
    public String getDescricaoDetalhada(){
        return descricaoDetalhada;
    }
    public void setDescricaoDetalhada(String descricaoDetalhada){
        this.descricaoDetalhada = descricaoDetalhada;
    }
}
