package br.com.bancodigital.view;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.bancodigital.DAO.ClienteDAO;
import br.com.bancodigital.DAO.ContaDAO;
import br.com.bancodigital.controller.ContaController;
import br.com.bancodigital.model.Cliente;
import br.com.bancodigital.model.ContaCorrente;
import br.com.bancodigital.model.ContaPoupanca;

public class AberturaConta {
    public static void abrirConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Abertura de conta:");
        System.out.println("Digite o ID do cliente:");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        Cliente cliente = new ClienteDAO().buscarCliente(idCliente);
        if (cliente != null) {
            System.out.println("Escolha o tipo de conta:");
            System.out.println("1. Conta Corrente");
            System.out.println("2. Conta Poupança");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    abrirContaCorrente(cliente, scanner);
                    break;
                case 2:
                    abrirContaPoupanca(cliente, scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void abrirContaCorrente(Cliente cliente, Scanner scanner) {
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        ContaCorrente conta = new ContaCorrente(numeroConta, saldo, "Conta Corrente", LocalDate.now().toString(), "Ativa");
        ContaController contaController = new ContaController(new ContaDAO());
        contaController.abrirContaCorrente(conta);
        System.out.println("Conta corrente aberta com sucesso!");
    }

    private static void abrirContaPoupanca(Cliente cliente, Scanner scanner) {
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        ContaPoupanca conta = new ContaPoupanca(numeroConta, saldo, "Conta Poupança", LocalDate.now().toString(), "Ativa");
        ContaController contaController = new ContaController(new ContaDAO());
        contaController.abrirContaPoupanca(conta);
        System.out.println("Conta poupança aberta com sucesso!");
    }
}