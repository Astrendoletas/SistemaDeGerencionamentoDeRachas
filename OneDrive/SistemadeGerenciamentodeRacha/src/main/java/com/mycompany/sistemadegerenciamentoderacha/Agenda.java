/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentoderacha;
import java.time.LocalDateTime;

public class Agenda {
    private Quadra quadra;
    public Agenda() {
    }

    public Agenda(Quadra quadra) {
        this.quadra = quadra;
    }

    public LocalDateTime getdataHora() {
        return dataHora;
    }

    public void setdataHora(LocalDateTime DataHora) {
        this.dataHora = DataHora;
    }
    LocalDateTime dataHora = LocalDateTime.now();
}
