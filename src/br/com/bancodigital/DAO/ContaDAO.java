package br.com.bancodigital.DAO;

import br.com.bancodigital.model.ContaCorrente;
import br.com.bancodigital.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class ContaDAO {
    private List<ContaCorrente> contasCorrentes;
    private List<ContaPoupanca> contasPoupanca;

    public ContaDAO() {
        this.contasCorrentes = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
    }

    public void abrirContaCorrente(ContaCorrente conta) {
        contasCorrentes.add(conta);
    }

    public void abrirContaPoupanca(ContaPoupanca conta) {
        contasPoupanca.add(conta);
    }

    public void fecharConta(int numeroConta) {
        contasCorrentes.removeIf(conta -> conta.getNumeroConta() == numeroConta);
        contasPoupanca.removeIf(conta -> conta.getNumeroConta() == numeroConta);
    }

    public ContaCorrente buscarContaCorrente(int numeroConta) {
        for (ContaCorrente conta : contasCorrentes) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public ContaPoupanca buscarContaPoupanca(int numeroConta) {
        for (ContaPoupanca conta : contasPoupanca) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public List<ContaCorrente> listarContasCorrentes() {
        return contasCorrentes;
    }

    public List<ContaPoupanca> listarContasPoupanca() {
        return contasPoupanca;
    }
}