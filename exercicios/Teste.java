package exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite o nome: ");

        String nome1 = nome.nextLine();

        System.out.println("Digite a idade: ");
        int idade1 = idade.nextInt();

        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);

        nome.close();
        idade.close();
    }
}
