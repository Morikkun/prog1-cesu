import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        int escolhaUsuario = 0;
        Scanner entrada = new Scanner(System.in);
        

        do{
            System.out.println("Selecione uma opção \n" +
            "1.Adição 2.Subtração 3.Multiplicação 4.Divisão 5.Potência ao quadrado 0.Sair");
            escolhaUsuario = entrada.nextInt();
            switch (escolhaUsuario) {
            case 1:
                System.out.println("Digite o primeiro elemento");
                int parcela1 = entrada.nextInt();
                System.out.println("Digite o segundo elemento");
                int parcela2 = entrada.nextInt();
                System.out.println(Operacoes.soma(parcela1, parcela2));
                break;
            case 2:
                System.out.println("Digite o primeiro elemento");
                int minuendo = entrada.nextInt();
                System.out.println("Digite o segundo elemento");
                int subtraendo = entrada.nextInt();
                System.out.println(Operacoes.subtrai(minuendo, subtraendo));
                break;
            case 3:
                System.out.println("Digite o primeiro elemento");
                int fator1 = entrada.nextInt();
                System.out.println("Digite o segundo elemento");
                int fator2 = entrada.nextInt();
                System.out.println(Operacoes.multiplica(fator1, fator2));
                break;
            case 4:
                System.out.println("Digite o primeiro elemento");
                double dividendo = entrada.nextDouble();
                System.out.println("Digite o segundo elemento");
                double divisor = entrada.nextDouble();
                System.out.println(Operacoes.divide(dividendo, divisor));  
                break;
            case 5:
                System.out.println("Potência ao quadrado");
                System.out.println("Digite a base da potência");
                Long base = entrada.nextLong();
                System.out.println(Operacoes.aoQuadrado(base));
                break;
            case 0:
                System.out.println("Encerrando as operações");
                break;
            default:
                System.out.println("Opção inválida");
            }       
        } while (escolhaUsuario != 0);
        entrada.close();
    }
}
