package com.mycompany.exercicio02;

public class App {
    public static void main(String[] args) {
        //instanciar todas as classes criadas
        Aluno a = new Aluno(100, "fulano");
        Aluno a2 = new Aluno(200, "Ciclano");
        
        a.setNome("Felipe");
        
        Curso c1 = new Curso("Sistemas", 8);
        Curso c2 = new Curso("Agronomia", 10);
        
        Turma t1 = new Turma("2° Período", c1);
        Turma t2 = new Turma("2° Período", c2);
        
        Matricula m1 = new Matricula(20241, a, t1);
        Matricula m2 = new Matricula(20242, a2, t2);
        
        //imprimir tudo que conseguir
        System.out.println(m1.getAluno().getNome());
        System.out.println(m1.getTurma().getDescricao());
        System.out.println(m1.getTurma().getCurso().getNome());
    }
}
