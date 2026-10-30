/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentoderacha;

import java.util.List;

/**
 *
 * @author DELL
 */
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