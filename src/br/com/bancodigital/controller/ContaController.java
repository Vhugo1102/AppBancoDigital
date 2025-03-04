package br.com.bancodigital.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.bancodigital.DAO.ContaDAO;
import br.com.bancodigital.model.ContaCorrente;
import br.com.bancodigital.model.ContaPoupanca;
import br.com.bancodigital.model.Transacao;

public class ContaController {
   
	private ContaDAO contaDAO;
    private List<Transacao> transacoes;
   
    public ContaController(ContaDAO contaDAO) {
        this.contaDAO = contaDAO;
        this.transacoes = new ArrayList<>();
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
    
    public void registrarTransacao(Transacao transacao, ContaCorrente contaCorrente) {
        transacao.setIdTransacao(transacoes.size() + 1);
        transacoes.add(transacao);
        contaCorrente.adicionarTransacao(transacao);
        System.out.println("Transação registrada com sucesso!");
    }

    public void registrarTransacao(Transacao transacao, ContaPoupanca contaPoupanca) {
        transacao.setIdTransacao(transacoes.size() + 1);
        transacoes.add(transacao);
        contaPoupanca.adicionarTransacao(transacao);
        System.out.println("Transação registrada com sucesso!");
    }

    public List<Transacao> buscarTransacoes(ContaCorrente contaCorrente) {
        return contaCorrente.getTransacoes();
    }

    public List<Transacao> buscarTransacoes(ContaPoupanca contaPoupanca) {
        return contaPoupanca.getTransacoes();
    }
}