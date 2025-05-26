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

        Usuario usuarioNormal = new Usuario(102L, "maria.user", "abc456", userProfile);
        System.out.println(usuarioNormal);

        // 3. Testar o método logar e criar logs de auditoria
        System.out.println("\n--- Testando logins ---");
        LogAuditoria log1 = usuarioAdmin.logar("senha123", "192.168.1.100"); // Login de sucesso
        System.out.println(log1);

        LogAuditoria log2 = usuarioNormal.logar("senhaErrada", "10.0.0.5"); // Login de falha
        System.out.println(log2);

        LogAuditoria log3 = usuarioNormal.logar("abc456", "10.0.0.5"); // Login de sucesso
        System.out.println(log3);

        // 4. Testar o método criarSessao
        System.out.println("\n--- Criando sessões ---");
        Sessao sessaoAdmin = usuarioAdmin.criarSessao();
        System.out.println(sessaoAdmin);

        Sessao sessaoNormal = usuarioNormal.criarSessao();
        System.out.println(sessaoNormal);

        System.out.println("\n--- Verificando estado final dos usuários ---");
        System.out.println(usuarioAdmin);
        System.out.println(usuarioNormal);
    }
}
