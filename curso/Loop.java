package curso;

import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {

        // Criação de um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Teste");

        // Laço de repetição
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        
    }
    int i = 0;
    while ( i < 4) { 
        System.out.println("Teste");
        i++;
    }
}
}