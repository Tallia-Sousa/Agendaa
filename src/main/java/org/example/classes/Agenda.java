package org.example.classes;

import java.util.ArrayList;

public class Agenda {

    //lista que vai armazenar objetos do tipo Endereco
    private ArrayList<Endereco> agenda;


    public Agenda() {
        agenda = new ArrayList<>();
    }

    public void cadastrarEndereco(String cep, String endereco, String pontoReferencia) {
        Endereco novoEndereco = new Endereco(cep, endereco, pontoReferencia);
        agenda.add(novoEndereco);
    }

    public void removerEndereco(String cep) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getCep().equals(cep)) {
                agenda.remove(i);
                System.out.println("Endereço com CEP " + cep + " removido com sucesso.");
                return; // Encerra o loop depois de remover o endereço
            }
        }
        System.out.println("O endereço com o CEP: " + cep + " não foi encontrado na agenda.");
    }



    public void listarEndereco() {
        if (agenda.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("Lista de Endereços:\n");
            for (Endereco endereco : agenda) {
                System.out.println(endereco);
            }

        }
    }












}
