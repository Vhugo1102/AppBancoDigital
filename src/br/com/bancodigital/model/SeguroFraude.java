package br.com.bancodigital.model;

public class SeguroFraude {
    private int numeroApolice;
    private String dataInicio;
    private String dataFim;
    private double valorSeguro;
    private String descricaoCobertura;

    // Construtor
    public SeguroFraude(int numeroApolice, String dataInicio, String dataFim, double valorSeguro, String descricaoCobertura) {
        this.numeroApolice = numeroApolice;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorSeguro = valorSeguro;
        this.descricaoCobertura = descricaoCobertura;
    }

    // Getters e setters
    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getDescricaoCobertura() {
        return descricaoCobertura;
    }

    public void setDescricaoCobertura(String descricaoCobertura) {
        this.descricaoCobertura = descricaoCobertura;
    }

    @Override
    public String toString() {
        return "SeguroFraude{" +
                "numeroApolice=" + numeroApolice +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", valorSeguro=" + valorSeguro +
                ", descricaoCobertura='" + descricaoCobertura + '\'' +
                '}';
    }
}