package edu.guilherme.lab.lista.aula00;

import java.util.Scanner;

public class Aula00 {
    public static void main(String[] args){
        float n1, n2, n3;
        String nome;

        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Bem Vindo ao Sistema Escolar de Notas ---");

        System.out.println("Digite o nome do aluno: ");
        nome = leitor.next();

        System.out.println("Digite a nota 1 de "+nome+" : ");
        n1 = leitor.nextFloat();

        System.out.println("Digite a nota 2 de "+nome+" :");
        n2 = leitor.nextFloat();

        System.out.println("Digite a nota 3 de "+nome+" :");
        n3 = leitor.nextFloat();

        float resultado = (n1 + n2 + n3)/3 ;

        if(resultado >= 7){
            System.out.println("Esse aluno foi aprovado com a nota "+resultado);
        }
        else if(resultado >= 6 || resultado <= 6.9){
            System.out.println("Esse aluno está na final com a nota " +resultado);
        }
        else{
            System.out.println("Esse aluno está reprovado com a nota " +resultado);
        }
    }
}
