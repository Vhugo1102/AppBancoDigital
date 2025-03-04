package br.com.bancodigital.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.bancodigital.model.Cliente;

public class ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAO() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void excluirCliente(int idCliente) {
        clientes.removeIf(cliente -> cliente.getIdCliente() == idCliente);
    }

    public void atualizarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == cliente.getIdCliente()) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    public Cliente buscarCliente(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}