package br.com.bancodigital.model;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String numeroAgencia;
    private int numeroConta;
    private double saldo;
    private String tipoConta;
    private String dataAbertura;
    private String status;
    private List<Transacao> transacoes;
    
    // Construtor
    public ContaCorrente(int numeroConta, double saldo, String tipoConta, String dataAbertura, String status) {
        this.numeroAgencia = "0001";
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.transacoes = new ArrayList<Transacao>();
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
    
     public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
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
    
	public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }
	
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }
    
    public void transferirPix(String pixDestinatario, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Transferência Pix efetuada com sucesso para " + pixDestinatario);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    
    public void extrato() {
        System.out.println("Extrato da Conta Corrente:");
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Histórico de Transações:");
        for (Transacao transacao : getTransacoes()) {
            System.out.println(transacao);
        }
    }
}