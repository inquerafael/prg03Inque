/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamento;

/**
 *
 * @author inque
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;

    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    //metodos
    @Override
    public String toString() {
        return "Sessao{" +
               "id=" + id +
               ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "N/A") +
               ", token='" + token + '\'' +
               '}';
    }
    
    // Getters
    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    
}
