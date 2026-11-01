package com.mycompany.sistemadegerenciamentoderacha;

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