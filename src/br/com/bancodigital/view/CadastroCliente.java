package br.com.bancodigital.view;

import java.util.Scanner;

import br.com.bancodigital.DAO.ClienteDAO;
import br.com.bancodigital.controller.ClienteController;
import br.com.bancodigital.model.Cliente;

public class CadastroCliente {
    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de cliente:");
        System.out.println("Digite o ID do cliente:");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o e-mail do cliente:");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o CEP do cliente:");
        String cep = scanner.nextLine();
        System.out.println("Digite a cidade do cliente:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o UF do cliente:");
        String uf = scanner.nextLine();
        Cliente cliente = new Cliente(idCliente, nome, email, telefone, cpf, endereco, cep, cidade, uf);
        ClienteController clienteController = new ClienteController(new ClienteDAO());
        clienteController.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}