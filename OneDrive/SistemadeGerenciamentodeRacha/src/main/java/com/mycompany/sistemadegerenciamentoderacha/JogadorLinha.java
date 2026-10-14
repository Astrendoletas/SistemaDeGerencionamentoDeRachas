/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentoderacha;

/**
 *
 * @author DELL
 */
public class JogadorLinha extends Jogador{
    
    private enum PosicaoLinhaEnum {
    ZAG,
    LATERAL,
    VOLANTE,
    MEIA,
    ATACANTE
}
    private PosicaoLinhaEnum Posicao;

    public PosicaoLinhaEnum getPosicao() {
        return Posicao;
    }

    public void setPosicao(PosicaoLinhaEnum Posicao) {
        this.Posicao = Posicao;
    }

    
    
}
