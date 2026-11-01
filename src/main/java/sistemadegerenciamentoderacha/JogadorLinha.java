package sistemadegerenciamentoderacha;

public class JogadorLinha extends Jogador {
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