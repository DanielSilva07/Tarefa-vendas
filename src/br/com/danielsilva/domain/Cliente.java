package br.com.danielsilva.domain;

public class Cliente implements Persistente {

    private String nome;
    private Long cpf;
    private Long tel;
    private Long numero;
    private String endereco;


    public Cliente(String nome , Long cpf ,String endereco , Long tel , Long numero ){
        this.nome= nome;
        this.cpf = cpf;
        this.tel= tel;
        this.numero = numero;
        this.endereco= endereco;

    }

    public Cliente() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}