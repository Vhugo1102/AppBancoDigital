package br.com.bancodigital.model;

public class SeguroViagem {
    private int numeroApolice;
    private String dataInicio;
    private String dataFim;
    private double valorSeguro;
    private String destino;

    // Construtor
    public SeguroViagem(int numeroApolice, String dataInicio, String dataFim, double valorSeguro, String destino) {
        this.numeroApolice = numeroApolice;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorSeguro = valorSeguro;
        this.destino = destino;
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "SeguroViagem{" +
                "numeroApolice=" + numeroApolice +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", valorSeguro=" + valorSeguro +
                ", destino='" + destino + '\'' +
                '}';
    }
    

}