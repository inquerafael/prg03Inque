/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamento;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author inque
 */
public class PerfilUsuario {
    private int id;
    private String descricao;
    private List<String> permissoes;

    //construtor
    public PerfilUsuario(int id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    
    //metodos
    @Override
    public String toString() {
        return "PerfilUsuario{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", permissoes=" + permissoes +
               '}';
    }

    //geters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }
    
    //seters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
}
