import java.util.Scanner;
public class sistemabanco {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        double deposito;
        double saque;
        double obj = 100;
           while (obj != 4); {
           System.out.println("----CAIXA ELETRONICO----");
           System.out.println("SAQUE- 1");
           System.out.println("DEPOSITO- 2");
           System.out.println("SALDO- 3");
           System.out.println("SAIR- 4");
           obj = tcl.nextInt();
                if (obj == 1) {
                    System.out.println("valor do saque");
                    saque = tcl.nextDouble();
                    saldo = saldo - saque;
                }
                if (obj == 2) {
                    System.out.println("Digite o valor do seu deposito");
                    deposito = tcl.nextDouble();
                    saldo = saldo + deposito;
                }
                if (obj == 3){
                    System.out.println("Seu saldo é" + saldo);              
                }
                if (obj == 4) {
                    System.out.println("Você saiu do sistema");
                }
         }                
         }
    }
    

