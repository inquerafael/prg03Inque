/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamento;

import java.time.LocalDateTime;
import java.util.List; // Importar se PerfilUsuario usar List
import java.util.ArrayList; // Importar se PerfilUsuario usar ArrayList

import br.com.ifba.atividade10.relacionamento.Usuario;
import br.com.ifba.atividade10.relacionamento.PerfilUsuario;
import br.com.ifba.atividade10.relacionamento.LogAuditoria;
import br.com.ifba.atividade10.relacionamento.Sessao;

/**
 *
 * @author inque
 */
public class main {
    public static void main(String[] args) {
        System.out.println("----- DESAFIO: RELACIONAMENTOS DE CLASSE -----");

        // 1. Criar perfis de usuário com permissões
        List<String> permissoesAdmin = new ArrayList<>();
        permissoesAdmin.add("GERENCIAR_USUARIOS");
        permissoesAdmin.add("VISUALIZAR_LOGS");
        PerfilUsuario adminProfile = new PerfilUsuario(1, "Administrador", permissoesAdmin);
        System.out.println(adminProfile);

        List<String> permissoesUser = new ArrayList<>();
        permissoesUser.add("ACESSAR_DASHBOARD");
        PerfilUsuario userProfile = new PerfilUsuario(2, "Usuário Comum", permissoesUser);
        System.out.println(userProfile);

        // 2. Criar usuários e associá-los a perfis
        Usuario usuarioAdmin = new Usuario(101, "joao.admin", "senha123", adminProfile);
        System.out.println(usuarioAdmin);

        Usuario usuarioNormal = new Usuario(102, "maria.user", "abc456", userProfile);
        System.out.println(usuarioNormal);

        

        System.out.println("\n--- Verificando estado final dos usuários ---");
        System.out.println(usuarioAdmin);
        System.out.println(usuarioNormal);
    }
}
