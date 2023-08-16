package Rubens_Jean_Simon;

import java.util.Scanner;

public class calcuradora {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String texto = "Qual operação deseja realizar?: \n[1]Soma\n[2]Substração\n[3]Mult\n[4]Div";
        System.out.println(texto);
        int escolha = input.nextInt();

        System.out.println("Entrar o primeiro valor");
        Double val1 = input.nextDouble();

        System.out.println("Entrar o segundo valor");
        Double val2 = input.nextDouble();

        switch (escolha) {
            case 1:
                System.out.println(val1 + val2);
                break;

            case 2:
                System.out.println(val1 - val2);
                break;

            case 3:
                System.out.println(val1 * val2);
                break;

            case 4:
                if (val2 == 0) {
                    System.out.println("Você não pode dividir este valor por zero ");
                } else
                    System.out.println(val1 / val2);
                break;

            default:
                System.out.println("VALOR INVALIDO!");
                break;
        }

    }

}
