package br.com.bancodigital.controller;

import java.util.List;

import br.com.bancodigital.DAO.ContaDAO;
import br.com.bancodigital.model.ContaCorrente;
import br.com.bancodigital.model.ContaPoupanca;

public class ContaController {
    private ContaDAO contaDAO;

    public ContaController(ContaDAO contaDAO) {
        this.contaDAO = contaDAO;
    }

    public void abrirContaCorrente(ContaCorrente conta) {
        contaDAO.abrirContaCorrente(conta);
    }

    public void abrirContaPoupanca(ContaPoupanca conta) {
        contaDAO.abrirContaPoupanca(conta);
    }

    public void fecharConta(int idConta) {
        contaDAO.fecharConta(idConta);
    }

    public ContaCorrente buscarContaCorrente(int idConta) {
        return contaDAO.buscarContaCorrente(idConta);
    }

    public ContaPoupanca buscarContaPoupanca(int idConta) {
        return contaDAO.buscarContaPoupanca(idConta);
    }

    public List<ContaCorrente> listarContasCorrentes() {
        return contaDAO.listarContasCorrentes();
    }

    public List<ContaPoupanca> listarContasPoupanca() {
        return contaDAO.listarContasPoupanca();
    }
}