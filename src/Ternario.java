import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        String estado = "";
        double calif = 6.78;

        estado = calif >=6 ? "aprobado": "reprobado";
        System.out.println("estado = " + estado);

        //numero mayor
        int max = 0;
        Scanner buffer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = buffer.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = buffer.nextInt();

        System.out.println("Ingrese el tercer numero");
        int num3 = buffer.nextInt();

        max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;

        System.out.println("max = " + max);

    }
}
