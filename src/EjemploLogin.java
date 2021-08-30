import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {
        String usr = "perla";
        String pass = "hola";

        Scanner buffer = new Scanner(System.in);
        System.out.println("Capture username: ");
        String u = buffer.nextLine();

        System.out.println("Password: ");
        String p = buffer.nextLine();

        if(usr.equals(u) && pass.equals(p)){
            System.out.println("Bienvenido");

        }else{
            System.out.println("Vuelva a intentar".concat(usr));

        }

    }
}
