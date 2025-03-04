package br.com.bancodigital.view;

import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastro de cliente");
        System.out.println("2. Abertura de conta");
        System.out.println("3. Operações bancárias");
        System.out.println("4. Emissão de cartão");
        System.out.println("5. Seguros");
        System.out.println("6. Sair");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                CadastroCliente.cadastrarCliente();
                break;
            case 2:
                // Chamar a classe de abertura de conta
                break;
            case 3:
                // Chamar a classe de operações bancárias
                break;
            case 4:
                // Chamar a classe de emissão de cartão
                break;
            case 5:
                // Chamar a classe de seguros
                break;
            case 6:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}