package br.com.bancodigital.model;

public class CartaoCredito {
    private int numeroCartao;
    private double limiteCredito;
    private double saldoDisponivel;
    private String dataValidade;
    private String codigoSeguranca;

    // Construtor
    public CartaoCredito(int numeroCartao, double limiteCredito, double saldoDisponivel, String dataValidade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.limiteCredito = limiteCredito;
        this.saldoDisponivel = saldoDisponivel;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    // Getters e setters
    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numeroCartao=" + numeroCartao +
                ", limiteCredito=" + limiteCredito +
                ", saldoDisponivel=" + saldoDisponivel +
                ", dataValidade='" + dataValidade + '\'' +
                ", codigoSeguranca='" + codigoSeguranca + '\'' +
                '}';
    }
}