package exercicios;

public class ContaBancaria {

    private  String titular;
    private double saldo;
    private int agencia;
    private static double juros = 0.17;

    public  ContaBancaria(String titular, double saldoInicial, int agencia) {

        this.titular = titular;
        this.saldo = saldoInicial;
        this.agencia = agencia;

    }

    public  void aplicarJuros(){
        saldo += saldo * juros;
    }
    public  void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public  void  consultar() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Agencia: " + agencia);
        System.out.println("Juros: " + juros + " aplicado para o titural" +" "+ titular);

    }
}


