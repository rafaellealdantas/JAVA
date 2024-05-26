package Exercicios.MediaAlunos;

import java.util.Scanner;

public class Aluno 
{
    private double media;
    private String nome;
    private String matricula;
    private String turma;
    private double nota1;
    private double nota2;

    public double media()
    {
        return (nota1 + nota2) / 2;
    }
    public void informacoes()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = (scanner.nextLine());     

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = (scanner.nextLine()); 

        System.out.println("Digite a turma do aluno: ");
        String turma = (scanner.nextLine()); 

        System.out.println("Digite a primeira nota: ");
        double nota1 = (scanner.nextDouble());

        System.out.println("Digite a segunda nota: ");
        double nota2 = (scanner.nextDouble());
       
        this.matricula = matricula;
        this.nome = nome;
        this. turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;

        scanner.close();               
    }
    public void resultado()
    {
        if (media() < 7) 
        {
            System.out.println("a primeira nota foi: "  + nota1);
            System.out.println("a sugunda nota foi: " +  nota2);
            System.out.println("a média foi: " + media());
            System.out.println("aprovado () reprovado(X)");
        }
    }
    
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}
