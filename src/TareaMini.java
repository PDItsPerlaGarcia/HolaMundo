import java.util.Locale;
import java.util.Scanner;

public class TareaMini {
    public static void main(String[] args) {
        String nom1, nom2, nom3;
        Scanner buffer = new Scanner(System.in);
        System.out.println("Escriba el primer nombre: ");
        nom1 = buffer.nextLine();

        System.out.println("Escriba el segundo nombre: ");
        nom2 = buffer.nextLine();

        System.out.println("Escriba el tercer nombre: ");
        nom3 = buffer.nextLine();

        String caracter1 = nom1.charAt(1) + ".";
        String res1 = caracter1.toUpperCase() + nom1.substring(nom1.length()-2);

        String caracter2 = nom2.charAt(1) + ".";
        String res2 = caracter2.toUpperCase() + nom2.substring(nom2.length()-2);

        String caracter3 = nom3.charAt(1) + ".";
        String res3 = caracter3.toUpperCase() + nom3.substring(nom3.length()-2);

        String resultado = res1 + "_" + res2 + "_" + res3;
        System.out.println("resultado = " + resultado);


    }
}

