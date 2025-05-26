/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamento;

/**
 *
 * @author inque
 */
public class Usuario {
    private int id;
    private String nomeUsuario;
    private String senha; // Em um sistema real, a senha seria hash
    private PerfilUsuario perfilUsuario;
    private String ultimoLogin;
    private boolean ativo;
    private String email;

    public Usuario(int id, String nomeUsuario, String senha, PerfilUsuario perfilUsuario, String ultimoLogin) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.perfilUsuario = perfilUsuario;
        this.ultimoLogin = null; //definido quando fizer login 
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    public String getUltimoLogin() {
        return ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getEmail() {
        return email;
    }
    
}
