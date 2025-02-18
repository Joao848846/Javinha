package curso;

    public class ExemploBasico {
        public static void main(String[] args) {
            // Declaração de variáveis
            String saudacao = "Olá, Mundo!";
            int anoAtual = 2025;
            double pi = 3.14159;
            boolean isJavaFun = false;
            int numero = 10;
    
            // Exibindo os valores
            System.out.println(saudacao);
            System.out.println("Ano atual: " + anoAtual);
            System.out.println("Valor de Pi: " + pi);
            System.out.println("Java é divertido? " + isJavaFun);
            System.out.println(20 + numero);
    
            // Estruturas de controle
            if (isJavaFun) {
                System.out.println("Vamos aprender Java!");
            } else {
                System.out.println("Talvez outro dia.");
            }

            if (numero == 10) {
                System.out.println("O número é 10.");
            } else if (numero < 10) {
                System.out.println("O número é maior que 10.");
            } else {
                System.out.println("O número é menor que 10.");
                
            }
    
            // Laço de repetição
            for (int i = 1; i <= 6; i++) {
                System.out.println("Contagem: " + i);
            }
        }
}
