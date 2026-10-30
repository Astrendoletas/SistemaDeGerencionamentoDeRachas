/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentoderacha;

/**
 *
 * @author DELL
 */
public class JogadorGoleiro extends Jogador{

    private enum TipoGoleiroEnum{
        GolFixo,
        GolLinha
    }
    private TipoGoleiroEnum Goleiro;
    


    public TipoGoleiroEnum getGoleiro() {
        return Goleiro;
    }

    public void setGoleiro(TipoGoleiroEnum Goleiro) {
        this.Goleiro = Goleiro;
    }        
}