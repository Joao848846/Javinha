package poo; // poo = Progrmação orientada a objetos

public class Classes {

    public  static  void main(String[] args) {
        Carro meucarro = new Carro("Fusca");
        Carro meucarro1 = new Carro("Ferrari");
        Carro meucarro2 = new Carro("Palio");

        meucarro1.acelerar();
        meucarro2.acelerar();
        meucarro.acelerar();
    }
       static class Carro {

        String modelo;

        public  Carro(String modelo) {
           this.modelo = modelo;

            System.out.println("Carro criado");
        }

        public  void acelerar() {

            System.out.println("Acelerando o carro" + " " + this.modelo);
        }
    }

}
