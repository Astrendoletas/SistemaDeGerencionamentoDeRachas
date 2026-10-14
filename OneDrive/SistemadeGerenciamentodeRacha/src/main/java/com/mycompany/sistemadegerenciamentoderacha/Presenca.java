/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentoderacha;

import java.math.BigDecimal;

/**
 *
 * @author DELL
 */
public class Presenca {
    
    
    private Boolean presente;
    private Boolean pagou;
    private BigDecimal valorPago;    
    
    public Presenca(Boolean presente, Boolean pagou, BigDecimal valorPago) {
        this.presente = presente;
        this.pagou = pagou;
        this.valorPago = valorPago;
    }    

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public Boolean getPagou() {
        return pagou;
    }

    public void setPagou(Boolean pagou) {
        this.pagou = pagou;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    
    
}
