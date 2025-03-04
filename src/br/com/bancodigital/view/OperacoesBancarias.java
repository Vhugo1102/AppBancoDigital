package br.com.bancodigital.view;

import br.com.bancodigital.DAO.ContaDAO;
import br.com.bancodigital.controller.ContaController;
import br.com.bancodigital.model.ContaCorrente;
import br.com.bancodigital.model.ContaPoupanca;
import br.com.bancodigital.model.Transacao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class OperacoesBancarias {
    public static void realizarOperacoes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operações bancárias:");
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        ContaController contaController = new ContaController(new ContaDAO());
        ContaCorrente contaCorrente = contaController.buscarContaCorrente(numeroConta);
        ContaPoupanca contaPoupanca = contaController.buscarContaPoupanca(numeroConta);
        if (contaCorrente != null) {
            realizarOperacoesContaCorrente(contaCorrente, scanner, contaController);
        } else if (contaPoupanca != null) {
            realizarOperacoesContaPoupanca(contaPoupanca, scanner, contaController);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void realizarOperacoesContaCorrente(ContaCorrente conta, Scanner scanner, ContaController contaController) {
        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Transferir Pix");
            System.out.println("4. Saldo");
            System.out.println("5. Extrato");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                	System.out.println("Digite o valor a sacar:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    conta.sacar(valor);
                    contaController.registrarTransacao(new Transacao(1, "Saque", valor, LocalDate.now(), LocalTime.now(), "Saque efetuado com sucesso!"), conta);
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar:");
                    valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    conta.depositar(valor);
                    contaController.registrarTransacao(new Transacao(1, "Depósito", valor, LocalDate.now(), LocalTime.now(), "Depósito efetuado com sucesso!"),conta);
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("Digite o Pix do destinatário:");
                    String pix = scanner.nextLine();
                    conta.transferirPix(pix, valor);
                    contaController.registrarTransacao(new Transacao(1, "Transferência Pix", valor, LocalDate.now(), LocalTime.now(), "Transferência Pix efetuada com sucesso!"),conta);
                    break;
                case 4:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 5:
                    List<Transacao> transacoes = contaController.buscarTransacoes(conta);
                    for (Transacao transacao : transacoes) {
                        System.out.println(transacao);
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void realizarOperacoesContaPoupanca(ContaPoupanca conta, Scanner scanner, ContaController contaController) {
        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Transferir Pix");
            System.out.println("4. Saldo");
            System.out.println("5. Extrato");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a sacar:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    conta.sacar(valor);
                    contaController.registrarTransacao(new Transacao(1, "Saque", valor, LocalDate.now(), LocalTime.now(), "Saque efetuado com sucesso!"),conta);
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar:");
                    valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    conta.depositar(valor);
                    contaController.registrarTransacao(new Transacao(1, "Depósito", valor, LocalDate.now(), LocalTime.now(), "Depósito efetuado com sucesso!"),conta);
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("Digite o Pix do destinatário:");
                    String pix = scanner.nextLine();
                    conta.transferirPix(pix, valor);
                    contaController.registrarTransacao(new Transacao(1, "Transferência Pix", valor, LocalDate.now(), LocalTime.now(), "Transferência Pix efetuada com sucesso!"),conta);
                    break;
                case 4:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 5:
                    List<Transacao> transacoes = contaController.buscarTransacoes(conta);
                    for (Transacao transacao : transacoes) {
                        System.out.println(transacao);
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    
}