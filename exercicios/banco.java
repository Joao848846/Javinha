package exercicios;

public class banco {

    static class ContaBancaria {

        private double saldo; // o saldo da conta ( privado para proteção

        // Construtor para definir um saldo inicial

        public ContaBancaria(double saldoInicial) {
            if (saldoInicial >= 0) {
                this.saldo = saldoInicial;
            } else  {
                System.out.println("Saldo inicial inválido");
            }
        }

        // Metodo para depositar dinheiro

        public void depositar (double valor) {
            if (valor > 0) {
                saldo += valor; // somataria do saldo + = valor existente
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
            } else {
                System.out.println("Valor inválido para depósito ");
            }
        }

        // Metodo para sacar

        public void sacar(double valor) {
            // Verifica se o valor é maior que zero e menor ou igual ao saldo
            if (valor > 0 && valor <= saldo) {
                saldo -= valor; // Subtrai o valor do saldo atual
                System.out.println("Saque de R$ " + valor + " realizado com sucesso"); // Mensagem de confirmação
            } else {
                // Caso o valor seja inválido ou maior do que o saldo, exibe mensagem de erro
                System.out.println("Saldo insuficiente para saque");
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(200);

        System.out.println("Saldo atual R$ " + conta1.getSaldo());

        conta1.depositar(50);
        System.out.println("Saldo atual R$ " + conta1.getSaldo());

        conta1.sacar(100);
        System.out.println("Saldo atual R$ " + conta1.getSaldo());
    }

}
