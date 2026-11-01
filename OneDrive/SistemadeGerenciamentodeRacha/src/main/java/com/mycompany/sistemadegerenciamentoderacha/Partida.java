package com.mycompany.sistemadegerenciamentoderacha;

import java.math.BigDecimal;

public class Partida {
    private String partida;
    private String obs;
    private Integer limiteJogadores;
    private BigDecimal preco;

    private Agenda agenda;
    private Presenca presenca;

    public Partida(
        String partida,
        String obs,
        Integer limiteJogadores,
        BigDecimal preco,
        Agenda agenda,
        Presenca presenca
    ) {
        this.partida = partida;
        this.obs = obs;
        this.limiteJogadores = limiteJogadores;
        this.preco = preco;
        this.agenda = agenda;
        this.presenca = presenca;
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

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Presenca getPresenca() {
        return presenca;
    }

    public void setPresenca(Presenca presenca) {
        this.presenca = presenca;
    }

    public Quadra ConsultarQuadra() {
        return agenda.getQuadra();
    }

    public BigDecimal ConsultarPreco() {
        return agenda.getQuadra().getPrecohora();
    }
}