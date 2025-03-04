package br.com.bancodigital.model;

public class ContaCorrente {
    private String numeroAgencia;
    private int numeroConta;
    private double saldo;
    private String tipoConta;
    private String dataAbertura;
    private String status;

    // Construtor
    public ContaCorrente(int numeroConta, double saldo, String tipoConta, String dataAbertura, String status) {
        this.numeroAgencia = "0001";
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.dataAbertura = dataAbertura;
        this.status = status;
    }

    // Getters e setters
    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroAgencia='" + numeroAgencia + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", tipoConta='" + tipoConta + '\'' +
                ", dataAbertura='" + dataAbertura + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}