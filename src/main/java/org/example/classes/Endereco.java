package org.example.classes;

public class Endereco {

    private String cep;
    private String endereco;
    private String referencia;

    public Endereco(String cep) {
        this.cep = cep;
    }

    public Endereco(String cep, String endereco, String referencia) {
        this.cep = cep;
        this.endereco = endereco;
        this.referencia = referencia;

    }


    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getReferencia() {
        return referencia;
    }

    @Override
    public String toString() {
        return "CEP: " + cep + "\nEndereço: " + endereco + "\nPonto de Referência: " + referencia + "\n";
    }
}



