package curso;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criação de um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Ana");

        // Acessando um elemento pelo índice
        System.out.println("Elemento no índice 2: " + nomes.get(2));

        // Removendo um elemento pelo índice
        nomes.remove(2);

        // Exibindo o tamanho do ArrayList
        System.out.println("Tamanho do ArrayList: " + nomes.size());

        // Iterando sobre os elementos do ArrayList
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}