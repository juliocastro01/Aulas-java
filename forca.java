
import java.util.Scanner;

public class forca {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String palavra = "julio";
        String palavraAux[] = new String[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            palavraAux[i] = "x";
            System.out.print(palavraAux[i]);
        }
        System.out.println("");
        System.out.println("Digite apenas uma letra");
        String letra = tcl.next();
        char letrab[] = letra.toCharArray();

        System.out.println(letra.charAt(0));
        for (int i = 0; i < palavra.length(); i++) {

            if (palavra.charAt(i) == letra.charAt(0)) {
                palavraAux[i] = letra + "xxxx";
                System.out.print(palavraAux[i]);
            }
            }
        }

      
    }

