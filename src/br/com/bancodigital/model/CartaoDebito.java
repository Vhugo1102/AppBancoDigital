package br.com.bancodigital.model;

public class CartaoDebito {
    private int numeroCartao;
    private double limiteDiario;
    private String dataValidade;
    private String codigoSeguranca;

    // Construtor
    public CartaoDebito(int numeroCartao, double limiteDiario, String dataValidade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.limiteDiario = limiteDiario;
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

    public double getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(double limiteDiario) {
        this.limiteDiario = limiteDiario;
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
        return "CartaoDebito{" +
                "numeroCartao=" + numeroCartao +
                ", limiteDiario=" + limiteDiario +
                ", dataValidade='" + dataValidade + '\'' +
                ", codigoSeguranca='" + codigoSeguranca + '\'' +
                '}';
    }
}