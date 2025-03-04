package br.com.bancodigital.controller;

import java.util.List;

import br.com.bancodigital.DAO.CartaoDAO;
import br.com.bancodigital.model.CartaoCredito;
import br.com.bancodigital.model.CartaoDebito;

public class CartaoController {
    private CartaoDAO cartaoDAO;

    public CartaoController(CartaoDAO cartaoDAO) {
        this.cartaoDAO = cartaoDAO;
    }
    
    public void criarCartaoCredito(int numeroCartao, double limiteCredito, double saldoDisponivel, String dataValidade, String codigoSeguranca) {
        CartaoCredito cartao = new CartaoCredito(numeroCartao, limiteCredito, saldoDisponivel, dataValidade, codigoSeguranca);
        emitirCartaoCredito(cartao);
    }

    public void criarCartaoDebito(int numeroCartao, double limiteDiario, String dataValidade, String codigoSeguranca) {
        CartaoDebito cartao = new CartaoDebito(numeroCartao, limiteDiario, dataValidade, codigoSeguranca);
        emitirCartaoDebito(cartao);
    }
    
    public void emitirCartaoCredito(CartaoCredito cartao) {
        cartaoDAO.emitirCartaoCredito(cartao);
    }

    public void emitirCartaoDebito(CartaoDebito cartao) {
        cartaoDAO.emitirCartaoDebito(cartao);
    }

    public void bloquearCartao(int numeroCartao) {
        cartaoDAO.bloquearCartao(numeroCartao);
    }

    public CartaoCredito buscarCartaoCredito(int numeroCartao) {
        return cartaoDAO.buscarCartaoCredito(numeroCartao);
    }

    public CartaoDebito buscarCartaoDebito(int numeroCartao) {
        return cartaoDAO.buscarCartaoDebito(numeroCartao);
    }

    public List<CartaoCredito> listarCartoesCredito() {
        return cartaoDAO.listarCartoesCredito();
    }

    public List<CartaoDebito> listarCartoesDebito() {
        return cartaoDAO.listarCartoesDebito();
    }
}