public class Operacoes {

    public static int soma(int elementoA, int elementoB){
        int resultado;
        return resultado = elementoA + elementoB;
    }

    public static int subtrai(int elementoA, int elementoB){
        int resultado;
        return resultado = elementoA - elementoB;
    }

    public static int multiplica(int elementoA, int elementoB){
        int resultado;
        return resultado = elementoA * elementoB;
    }

    public static double divide(double dividendo, double divisor){
        double resultado;
        return resultado = dividendo / divisor;
    }

    public static long aoQuadrado(long base){
        long resultado = 1;
        for (int i = 0; i < 2; i++){
            resultado *= base;
        }
        return resultado;
    }
}