package br.com.bancodigital.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.bancodigital.DAO.ClienteDAO;
import br.com.bancodigital.controller.ClienteController;
import br.com.bancodigital.enums.CategoriaCliente;
import br.com.bancodigital.model.Cliente;

public class CadastroCliente {
    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de cliente:");
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o e-mail do cliente:");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente (dd/MM/yyyy):");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o CEP do cliente:");
        String cep = scanner.nextLine();
        System.out.println("Digite a cidade do cliente:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o UF do cliente:");
        String uf = scanner.nextLine();
        System.out.println("Digite a categoria do cliente (COMUM, SUPER, PREMIUM):");
        String categoria = scanner.nextLine();
        CategoriaCliente categoriaEnum = CategoriaCliente.valueOf(categoria.toUpperCase());

        // Validar o CPF
        if (!validarCPF(cpf)) {
            System.out.println("Erro: CPF inválido");
            return;
        }

        // Validar o nome
        if (!validarNome(nome)) {
            System.out.println("Erro: nome inválido");
            return;
        }

        // Validar a data de nascimento
        LocalDate dataNascimentoValidada = validarDataNascimento(dataNascimento);
        if (dataNascimentoValidada == null) {
            System.out.println("Erro: data de nascimento inválida");
            return;
        }

        Cliente cliente = new Cliente(0,nome, email, telefone, cpf, endereco, cep, cidade, uf, categoriaEnum, dataNascimentoValidada);
        ClienteController clienteController = new ClienteController(new ClienteDAO());
        clienteController.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static boolean validarCPF(String cpf) {
        // Verificar se o CPF é único (essa validação deve ser feita no banco de dados)
        // ...

        // Verificar se o CPF tem o formato correto
        Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = pattern.matcher(cpf);
        if (!matcher.matches()) {
            return false;
        }

        // Verificar se o CPF é uma sequência de números repetidos
        Pattern pattern2 = Pattern.compile("(\\d)\\1{10}");
        Matcher matcher2 = pattern2.matcher(cpf.replaceAll("\\D", ""));
        if (matcher2.matches()) {
            return false;
        }

        // Verificar se o CPF é autêntico
        // ...
        return true;
    }

    private static boolean validarNome(String nome) {
        // Verificar se o nome contém apenas letras e espaços
        Pattern pattern = Pattern.compile("^[a-zA-Z ]+$");
        Matcher matcher = pattern.matcher(nome);
        if (!matcher.matches()) {
            return false;
        }

        // Verificar se o nome tem comprimento mínimo de 2 caracteres e máximo de 100
        // caracteres
        if (nome.length() < 2 || nome.length() > 100) {
            return false;
        }
        return true;
    }

    private static LocalDate validarDataNascimento(String dataNascimento) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimentoValidada = LocalDate.parse(dataNascimento, formatter);

            // Verificar se o cliente é maior de idade
            if (dataNascimentoValidada.isAfter(LocalDate.now().minusYears(18))) {
                return null;
            }
            return dataNascimentoValidada;
        } catch (DateTimeParseException e) {
            return null;
        }
    }

}    