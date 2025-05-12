/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.contaBanco;
import br.com.ifba.atividade08.contaBanco.Conta;

/**
 *
 * @author inque
 */
public class Banco {
    public static void main(String[] args) {
        System.out.print("ola\n");
       
        // Criando contas chamando o construtor da classe Conta
        Conta contaDaMaria = new Conta(555, "CC", "Maria Oliveira");
        Conta contaDoCarlos = new Conta(666, "CP", "Carlos Alberto");
        Conta contaComSaldoInicial = new Conta(777, "CC", "Ana Beatriz");

        // Interagindo com as contas criadas
        System.out.println("Número da conta de " + contaDaMaria.getDono() + ": " + contaDaMaria.getNumConta());
        contaDaMaria.depositar(50.0);
        contaDoCarlos.sacar(20.0);
        contaComSaldoInicial.depositar(100.0);
        contaComSaldoInicial.pagarMensal();
        contaDoCarlos.fecharConta();
        contaDoCarlos.depositar(10.0); // Tentativa de depósito em conta fechada
    }
}
