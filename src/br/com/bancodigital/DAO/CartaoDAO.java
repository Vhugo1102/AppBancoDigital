package br.com.bancodigital.DAO;

import br.com.bancodigital.model.CartaoCredito;
import br.com.bancodigital.model.CartaoDebito;

import java.util.ArrayList;
import java.util.List;

public class CartaoDAO {
    private List<CartaoCredito> cartoesCredito;
    private List<CartaoDebito> cartoesDebito;

    public CartaoDAO() {
        this.cartoesCredito = new ArrayList<>();
        this.cartoesDebito = new ArrayList<>();
    }

    public void emitirCartaoCredito(CartaoCredito cartao) {
        cartoesCredito.add(cartao);
    }

    public void emitirCartaoDebito(CartaoDebito cartao) {
        cartoesDebito.add(cartao);
    }

    public void bloquearCartao(int numeroCartao) {
        cartoesCredito.removeIf(cartao -> cartao.getNumeroCartao() == numeroCartao);
        cartoesDebito.removeIf(cartao -> cartao.getNumeroCartao() == numeroCartao);
    }

    public CartaoCredito buscarCartaoCredito(int numeroCartao) {
        for (CartaoCredito cartao : cartoesCredito) {
            if (cartao.getNumeroCartao() == numeroCartao) {
                return cartao;
            }
        }
        return null;
    }

    public CartaoDebito buscarCartaoDebito(int numeroCartao) {
        for (CartaoDebito cartao : cartoesDebito) {
            if (cartao.getNumeroCartao() == numeroCartao) {
                return cartao;
            }
        }
        return null;
    }

    public List<CartaoCredito> listarCartoesCredito() {
        return cartoesCredito;
    }

    public List<CartaoDebito> listarCartoesDebito() {
        return cartoesDebito;
    }
}