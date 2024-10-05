package com.mycompany.exercicio02;

public class Aluno {
    private int codigo;
    private String nome;
    private String endereço;
    
    Aluno(int c, String n){
        this.codigo = c;
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
}
