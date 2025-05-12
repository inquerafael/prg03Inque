/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.contaBanco;

/**
 *
 * @author inque
 */
public class Conta {
    //variaves
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //construtor
    public Conta(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0.0;
        this.status = true;
    }

    //metodos
    public void abrirConta(){
        //...
        
    }
    public void fecharConta(){
        this.status = false;
        System.out.println("Conta " + this.numConta + " de " + this.dono + " foi fechada.");
    }
    public void depositar(double valor){
        if (this.status) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + this.numConta + ". Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Não é possível depositar em uma conta inativa.");
        }
    }
    public void sacar(double valor){
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado na conta " + this.numConta + ". Novo saldo: R$" + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para saque na conta " + this.numConta + ".");
            }
        } else {
            System.out.println("Não é possível sacar de uma conta inativa.");
        }
    }
    public void pagarMensal(){
        double mensalidade = (this.tipo.equals("CC")) ? 12.0 : 20.0;
        if (this.status) {
            if (this.saldo >= mensalidade) {
                this.saldo -= mensalidade;
                System.out.println("Mensalidade de R$" + mensalidade + " paga na conta " + this.numConta + ". Novo saldo: R$" + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade da conta " + this.numConta + ".");
            }
        } else {
            System.out.println("Não é possível cobrar mensalidade de uma conta inativa.");
        }
    }
    
    //getsAndSets
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
