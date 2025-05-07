/**
 * @author falvesmac
 */

package br.com.falves;

import java.util.Scanner;

public class Notas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    String nome = s.nextLine();

    System.out.println("Digite a primeira nota do aluno: ");
    double nota1 = s.nextDouble();

    System.out.println("Digite a segunda nota do aluno: ");
    double nota2 = s.nextDouble();

    System.out.println("Digite a terceira nota do aluno: ");
    double nota3 = s.nextDouble();

    System.out.println("Digite a quarta nota do aluno: ");
    double nota4 = s.nextDouble();

    double notaTotal = nota1 + nota2 + nota3 + nota4;
      double notaFinal = notaTotal / 4;

    if (notaFinal >= 7) {
      System.out.println("Aluno " + nome + " obteve a nota final " + notaFinal + " e foi aprovado com sucesso!");
    } else if (notaFinal >= 5) {
      System.out.println("Aluno " + nome + " obteve a nota final " + notaFinal + " está de recuperação!");
    } else {
      System.out.println("Aluno " + nome + " obteve a nota final " + notaFinal + " reprovado!");
    }


  }
  }