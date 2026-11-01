package sistemadegerenciamentoderacha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Quadra {
    private String nome;
    private Boolean ehPublica;
    private BigDecimal precoHora;
    private Boolean ativa;

    private Endereco endereco;
    private List<Agenda> agendas;

    public Quadra(
        String nome,
        Boolean ehPublica,
        BigDecimal precoHora,
        Boolean ativa,
        Endereco endereco
    ) {
        this.nome = nome;
        this.ehPublica = ehPublica;
        this.precoHora = precoHora;
        this.ativa = ativa;
        this.endereco = endereco;
        this.agendas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getehPublica() {
        return ehPublica;
    }

    public void setehPublica(Boolean ehPublica) {
        this.ehPublica = ehPublica;
    }

    public BigDecimal getPrecohora() {
        return precoHora;
    }

    public void setPrecoHora(BigDecimal precoHora) {
        this.precoHora = precoHora;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(List<Agenda> agendas) {
        this.agendas = agendas;
    }
}