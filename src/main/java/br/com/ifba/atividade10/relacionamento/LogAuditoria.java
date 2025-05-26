/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.relacionamento;

/**
 *
 * @author inque
 */
public class LogAuditoria {
    private int id;
    private Usuario usuario;
    private boolean tentativaLogin; // true se foi falha, false se foi sucesso (para o log de auditoria)
    private String dataHora;
    private String ip;

    public LogAuditoria(int id, Usuario usuario, boolean tentativaLogin, String dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.tentativaLogin = tentativaLogin;
        this.dataHora = dataHora;
        this.ip = ip;
    }
    
    //metodoos
    @Override
    public String toString() {
        String status = tentativaLogin ? "FALHA" : "SUCESSO";
        return "LogAuditoria{" +
               "id=" + id +
               ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "N/A") +
               ", statusLogin='" + status + '\'' +
               ", dataHora=" + dataHora +
               ", ip='" + ip + '\'' +
               '}';
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isTentativaLogin() {
        return tentativaLogin;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getIp() {
        return ip;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setTentativaLogin(boolean tentativaLogin) {
        this.tentativaLogin = tentativaLogin;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    
}
