/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.sistemaPagamentos;

/**
 *
 * @author inque
 */
public class PagamentoPix implements IPagamento{
    //atributos
    private double valor;
    private static final double TAXA_PERCENTUAL = 0.05; // 5% de taxa
    //construtor
    public PagamentoPix(double valor) {
        this.valor = valor;
    }
    //metodos
    @Override
    public double calculoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double imprimiRecibo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //get e set 
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

    
}
