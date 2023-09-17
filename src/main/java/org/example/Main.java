package org.example;

import org.example.classes.Agenda;
import org.example.classes.Endereco;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Agenda agendaEnderecos = new Agenda();
        System.out.println("Bem-vindo à sua agenda de endereços!\n");
        System.out.print("Faça o cadastro do endereço: ");
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Digite o Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite um Ponto de Referência: ");
        String referencia = scanner.nextLine();
        agendaEnderecos.cadastrarEndereco(cep, endereco, referencia);
        agendaEnderecos.listarEndereco();
        System.out.print(" Digite S para remover e N para não  ");
        String  resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("s")) {

            System.out.print("Digite o CEP: ");
            String cp = scanner.nextLine();
            agendaEnderecos.removerEndereco(cp);
            agendaEnderecos.listarEndereco();

            System.out.println("Programa encerrado.");
        } else if(resposta.equalsIgnoreCase("n")) {
            System.out.println("Programa encerrado.");
        }
        scanner.close();
    }


}

