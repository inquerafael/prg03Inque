/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.fatorial;
import java.math.BigInteger;
/**
 *
 * @author inque
 */
public class Fatorial {
    
    //variaveis
    private int valor;
    private BigInteger fatorial;
    private String formula;
    
    public void setValor(int n){//Atribui o valor recebido (n) à variável de instância valor
        this.valor = n;
        calcularFatorial();
        gerarFormula();
    }
    public BigInteger getFatorial(){
        return fatorial;
    }
    public String getFormula(){
        return formula;
    }

    private void calcularFatorial() {//responsável por calcular o fatorial
        fatorial = BigInteger.ONE;
        if (valor > 0) {
            for (int i = 1; i <= valor; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
        } else if (valor == 0) {
            fatorial = BigInteger.ONE;
        } else {
            fatorial = BigInteger.valueOf(-1); // Indica erro para negativos
        }
    }

    private void gerarFormula() {
        StringBuilder sb = new StringBuilder();//constroi strings de forma eficiente
        if (valor >= 0) {
            for (int i = valor; i >= 1; i--) {
                sb.append(i);
                if (i > 1) {
                    sb.append(" x ");
                }
            }
            if (valor == 0) {
                formula = "1";
            } else {
                formula = sb.toString() + " = " + fatorial;
            }
        } else {
            formula = "Fatorial não definido para números negativos";
        }
    }
}
