package exercicios;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaJoao = new ContaBancaria("João", 500, 5678);
        ContaBancaria contaMaria = new ContaBancaria("Maria", 1000, 1234);


        contaJoao.sacar(50);
        contaJoao.depositar(100);
        contaJoao.aplicarJuros();
        contaJoao.transferir(contaMaria, 200);
        contaJoao.consultar();  // João tem R$ 500
        contaMaria.consultar();

    }

}
