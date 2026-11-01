package sistemadegerenciamentoderacha;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SistemadeGerenciamentodeRacha {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua do Triangulo", "Triangulo", "Monte carmelo", "MG", "38500-00", "Barracao");
        Quadra quadra1 = new Quadra("Quadra do Triangulo", true, new BigDecimal("0.00"), true, endereco1);
        Agenda agenda = new Agenda(quadra1, LocalDateTime.now(), null);
        Partida partida = new Partida("Racha 0800", "Levar Galao de agua", 18, new BigDecimal("0.00"), agenda, null);
        agenda.setPartida(partida);
        System.out.println("Quadra: " + partida.ConsultarQuadra().getNome());
        System.out.println("Preco: " + partida.ConsultarPreco());
    }
}
