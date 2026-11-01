package com.mycompany.sistemadegerenciamentoderacha;

import java.util.List;

public class Jogador {
    private String nome;
    private String apelido;

    private List<Presenca> presenca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public List<Presenca> getPresenca() {
        return presenca;
    }

    public void setPresenca(List<Presenca> presenca) {
        this.presenca = presenca;
    }
}