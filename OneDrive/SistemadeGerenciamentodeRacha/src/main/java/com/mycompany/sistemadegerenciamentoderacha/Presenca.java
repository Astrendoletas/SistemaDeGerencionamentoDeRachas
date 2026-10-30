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
public class Presenca {
    
    
    private Boolean presente;
    private Boolean pagou;
    private BigDecimal valorPago;  
    private Partida partida;
    private Jogador jogador;
    
    public Presenca(Boolean presente, Boolean pagou, BigDecimal valorPago,Partida partida,Jogador jogador) {
        this.presente = presente;
        this.pagou = pagou;
        this.valorPago = valorPago;
        this.partida = partida;
        this.jogador = jogador;
    }    

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public Boolean getPagou() {
        return pagou;
    }

    public void setPagou(Boolean pagou) {
        this.pagou = pagou;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }    
    
}
