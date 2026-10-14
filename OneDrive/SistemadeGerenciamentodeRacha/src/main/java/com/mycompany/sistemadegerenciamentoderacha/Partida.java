/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentoderacha;

import java.math.BigDecimal;

/**
 *
 * @author DELL
 */
public class Partida {
    
    private String partida;
    private String obs;
    private Integer limiteJogadores;
    private BigDecimal preco;

    public Quadra ConsultarQuadra(){
    
    }
    public Integer ConsultarPreco(){
        
    }
    
    public Partida(String partida, String obs, Integer limiteJogadores, BigDecimal preco) {
        this.partida = partida;
        this.obs = obs;
        this.limiteJogadores = limiteJogadores;
        this.preco = preco;
    }

    
    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getLimiteJogadores() {
        return limiteJogadores;
    }

    public void setLimiteJogadores(Integer limiteJogadores) {
        this.limiteJogadores = limiteJogadores;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
}
