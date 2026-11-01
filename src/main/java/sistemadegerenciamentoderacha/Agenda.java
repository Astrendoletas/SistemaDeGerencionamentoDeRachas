package sistemadegerenciamentoderacha;

import java.time.LocalDateTime;

public class Agenda {
    private LocalDateTime dataHora;

    private Quadra quadra;
    private Partida partida;

    public Agenda() {
    }

    public Agenda(
        Quadra quadra,
        LocalDateTime dataHora,
        Partida partida
    ) {
        this.quadra = quadra;
        this.dataHora = dataHora;
        this.partida = partida;
    }

    public LocalDateTime getdataHora() {
        return dataHora;
    }

    public void setdataHora(LocalDateTime DataHora) {
        this.dataHora = DataHora;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }
}
