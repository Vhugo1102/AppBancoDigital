package br.com.bancodigital.view;

import java.util.Scanner;

import br.com.bancodigital.DAO.CartaoDAO;
import br.com.bancodigital.DAO.ContaDAO;
import br.com.bancodigital.DAO.SeguroDAO;
import br.com.bancodigital.controller.CartaoController;
import br.com.bancodigital.controller.ContaController;
import br.com.bancodigital.controller.SeguroController;
import br.com.bancodigital.model.ContaCorrente;
import br.com.bancodigital.model.ContaPoupanca;
import br.com.bancodigital.model.SeguroFraude;
import br.com.bancodigital.model.SeguroViagem;

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
			AberturaConta.abrirConta();// Chamar a classe de abertura de conta
			break;
		case 3:
			System.out.println("Escolha a conta:");
			System.out.println("1. Conta Corrente");
			System.out.println("2. Conta Poupança");
			int opcaoConta = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha
			ContaController contaController = new ContaController(new ContaDAO());
			Scanner scannerOperacoes = new Scanner(System.in);
			switch (opcaoConta) {
			case 1:
				System.out.println("Digite o número da conta corrente:");
				int numeroContaCorrente = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha
				ContaCorrente contaCorrente = contaController.buscarContaCorrente(numeroContaCorrente);
				if (contaCorrente != null) {
					OperacoesBancarias.realizarOperacoesContaCorrente(contaCorrente, scannerOperacoes, contaController);
				} else {
					System.out.println("Conta corrente não encontrada.");
				}
				break;
			case 2:
				System.out.println("Digite o número da conta poupança:");
				int numeroContaPoupanca = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha
				ContaPoupanca contaPoupanca = contaController.buscarContaPoupanca(numeroContaPoupanca);
				if (contaPoupanca != null) {
					OperacoesBancarias.realizarOperacoesContaPoupanca(contaPoupanca, scannerOperacoes, contaController);
				} else {
					System.out.println("Conta poupança não encontrada.");
				}
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			break;
		case 4:
			System.out.println("Emissão de cartão:");
			System.out.println("Escolha o tipo de cartão:");
			System.out.println("1. Cartão de Crédito");
			System.out.println("2. Cartão de Débito");
			int opcaoCartao = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha
			switch (opcaoCartao) {
			case 1:
				System.out.println("Digite o número do cartão:");
				int numeroCartao = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha
				System.out.println("Digite o limite de crédito:");
				double limiteCredito = scanner.nextDouble();
				scanner.nextLine(); // Consumir a quebra de linha
				System.out.println("Digite o saldo disponível:");
				double saldoDisponivel = scanner.nextDouble();
				scanner.nextLine(); // Consumir a quebra de linha
				System.out.println("Digite a data de validade:");
				String dataValidade = scanner.nextLine();
				System.out.println("Digite o código de segurança:");
				String codigoSeguranca = scanner.nextLine();
				CartaoController cartaoController = new CartaoController(new CartaoDAO());
				cartaoController.criarCartaoCredito(numeroCartao, limiteCredito, saldoDisponivel, dataValidade,
						codigoSeguranca);
			}
			break;
		case 5:
		    System.out.println("Seguros:");
		    System.out.println("Escolha o tipo de seguro:");
		    System.out.println("1. Seguro de Fraude");
		    System.out.println("2. Seguro de Viagem");
		    int opcaoSeguro = scanner.nextInt();
		    scanner.nextLine(); // Consumir a quebra de linha
		    SeguroController seguroController = new SeguroController(new SeguroDAO());
		    switch (opcaoSeguro) {
		        case 1:
		            System.out.println("Digite o número da apólice:");
		            int numeroApolice = scanner.nextInt();
		            scanner.nextLine(); // Consumir a quebra de linha
		            System.out.println("Digite a data de início:");
		            String dataInicio = scanner.nextLine();
		            System.out.println("Digite a data de fim:");
		            String dataFim = scanner.nextLine();
		            System.out.println("Digite o valor do seguro:");
		            double valorSeguro = scanner.nextDouble();
		            scanner.nextLine(); // Consumir a quebra de linha
		            System.out.println("Digite a descrição da cobertura:");
		            String descricaoCobertura = scanner.nextLine();
		            SeguroFraude seguroFraude = new SeguroFraude(numeroApolice, dataInicio, dataFim, valorSeguro, descricaoCobertura);
		            seguroController.contratarSeguroFraude(seguroFraude);
		            break;
		        case 2:
		            System.out.println("Digite o número da apólice:");
		            numeroApolice = scanner.nextInt();
		            scanner.nextLine(); // Consumir a quebra de linha
		            System.out.println("Digite a data de início:");
		            dataInicio = scanner.nextLine();
		            System.out.println("Digite a data de fim:");
		            dataFim = scanner.nextLine();
		            System.out.println("Digite o valor do seguro:");
		            valorSeguro = scanner.nextDouble();
		            scanner.nextLine(); // Consumir a quebra de linha
		            System.out.println("Digite o destino da viagem:");
		            String destino = scanner.nextLine();
		            SeguroViagem seguroViagem = new SeguroViagem(numeroApolice, dataInicio, dataFim, valorSeguro, destino);
		            seguroController.contratarSeguroViagem(seguroViagem);
		            break;
		        default:
		            System.out.println("Opção inválida. Tente novamente.");
		            break;
		    }
		    break;
		case 6:
			System.out.println("Saindo do sistema...");
			break;
		default:
			System.out.println("Opção inválida. Tente novamente.");
		}
	}
}