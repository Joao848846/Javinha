package poo;

public class teste1 {

  public static void main(String[] args) {
      //criando uma pessoa chamada João com 23 anos

      Pessoa p1 = new Pessoa("João", -1);
      p1.mostrarDados();

      //modificando o nome

      p1.setNome("Carlos");
              System.out.println("Novo Nome:" + " " + p1.getNome());

      //Tentando definir uma idade negativa (vai imprimir um aviso)

      p1.setIdade(-5);
      System.out.println("Idade invalida:" + " " + p1.getIdade());

      // Criando outra pessoa chamada Maria com idade válida
      Pessoa p2 = new Pessoa("Maria", 30);
      p2.mostrarDados();

      Pessoa p3 = new Pessoa("Jose", 18);
      p3.mostrarDados();
  }
    // Classe Pessoa dentro do mesmo arquivo
    static class Pessoa {
        private String nome;  // O nome da pessoa
        private int idade;    // A idade da pessoa

        // Construtor da classe
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            setIdade(idade); // Usamos o setter para validar a idade
        }

        // Getter para obter o nome
        public String getNome() {
            return nome;
        }

        // Setter para modificar o nome
        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter para obter a idade
        public int getIdade() {
            return idade;
        }

        // Setter para modificar a idade com validação
        public void setIdade(int idade) {
            if (idade >= 0) {  // Impedimos idades negativas
                System.out.println("Idade valida");
                this.idade = idade;

            } else {
                System.out.println("Sua idade:" + " " + idade + " " + "não é valída");
                this.idade = 0;
            }
        }

        // Método para exibir as informações da pessoa
        public void mostrarDados() {
            System.out.println("Nome: " + nome + ", Idade: " + idade);
        }
    }
}


