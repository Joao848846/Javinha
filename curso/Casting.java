package curso;

public class Casting {
    public static void main(String[] args) {
        // Casting
        // Convertir un tipo de dato a otro
        // Hay dos tipos de casting
        // 1. Casting implícito
        // 2. Casting

        int myint = 9;
        double mydouble = myint; // Casting implícito
        System.out.println(myint);
        System.out.println(mydouble);

        double resultado = 4.9;
        int resultadoint = (int) resultado;

        System.out.println(resultadoint);

        String meutest = "20";

        int test = Integer.parseInt(meutest); //transformando uma string em int
        System.out.println(test);

        int numb = 10;

        String tester = String.valueOf(numb);

        System.out.println(tester);
    }
}
