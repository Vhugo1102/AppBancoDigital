package br.com.bancodigital;

import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastro de Cliente");
            System.out.println("2. Abertura de Conta");
            System.out.println("3. Operações Bancárias");
            System.out.println("4. Emissão de Cartão");
            System.out.println("5. Seguros");
            System.out.println("6. Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastroCliente();
                    break;
                case 2:
                    aberturaConta(scanner);
                    break;
                case 3:
                    operacoesBancarias(scanner);
                    break;
                case 4:
                    emissaoCartao();
                    break;
                case 5:
                    seguros();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private static void cadastroCliente() {
        // Implementar a funcionalidade de cadastro de cliente
    }

    private static void aberturaConta(Scanner scanner) {
        System.out.println("Abertura de Conta");
        System.out.println("1. Conta Poupança");
        System.out.println("2. Conta Corrente");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Implementar a funcionalidade de abertura de conta poupança
                break;
            case 2:
                // Implementar a funcionalidade de abertura de conta corrente
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void operacoesBancarias(Scanner scanner) {
        System.out.println("Operações Bancárias");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Transferência Pix");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Extrato");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Implementar a funcionalidade de depósito
                break;
            case 2:
                // Implementar a funcionalidade de saque
                break;
            case 3:
                // Implementar a funcionalidade de transferência Pix
                break;
            case 4:
                // Implementar a funcionalidade de consulta de saldo
                break;
            case 5:
                // Implementar a funcionalidade de extrato
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void emissaoCartao() {
        // Implementar a funcionalidade de emissão de cartão
    }

    private static void seguros() {
        System.out.println("Seguros");
        System.out.println("1. Seguro Viagem");
        System.out.println("2. Seguro Fraude");

        // Implementar a funcionalidade de seguros
    }
}