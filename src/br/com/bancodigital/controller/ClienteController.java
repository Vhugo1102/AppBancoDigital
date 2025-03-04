package br.com.bancodigital.controller;

import java.util.List;

import br.com.bancodigital.DAO.ClienteDAO;
import br.com.bancodigital.model.Cliente;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.cadastrarCliente(cliente);
    }

    public void excluirCliente(int idCliente) {
        clienteDAO.excluirCliente(idCliente);
    }

    public void atualizarCliente(Cliente cliente) {
        clienteDAO.atualizarCliente(cliente);
    }

    public Cliente buscarCliente(int idCliente) {
        return clienteDAO.buscarCliente(idCliente);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }
}