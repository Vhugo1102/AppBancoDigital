package br.com.bancodigital.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transacao {
    private int idTransacao;
    private String tipoTransacao;
    private double valor;
    private LocalDate dataTransacao;
    private LocalTime horaTransacao;
    private String descricao;

    public Transacao(int idTransacao, String tipoTransacao, double valor, LocalDate dataTransacao, LocalTime horaTransacao, String descricao) {
        this.idTransacao = idTransacao;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
        this.horaTransacao = horaTransacao;
        this.descricao = descricao;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public LocalTime getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(LocalTime horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "idTransacao=" + idTransacao +
                ", tipoTransacao='" + tipoTransacao + '\'' +
                ", valor=" + valor +
                ", dataTransacao=" + dataTransacao +
                ", horaTransacao=" + horaTransacao +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}