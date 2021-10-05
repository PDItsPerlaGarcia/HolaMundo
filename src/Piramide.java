import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        //Imprimir ´piramide
        char car = '*', esp = ' ';
        int x;
        for(int i = 0; i < 9; i++){
            System.out.println("");

            for(x=i+1; x > 0; x--){
                System.out.print(car);
            }

        }
        System.out.println("----------------------------------");
        //imprimir piramide completa
        int num;
        Scanner buffer = new Scanner(System.in);
        System.out.println("Captura numero: ");
        num = buffer.nextInt();

        for (int i = num; i >0; i--){ //para imprimir la cantidad de lineas

            for (int j = i-1; j > 0; j--) { //para imprimir espacios
                System.out.print(esp);
            }

            for(x = 0; x < (2*(x+1)-1); x++){ //para imprimir la cantidad de *
                System.out.print(car);
            }
            System.out.println("");
        }

    }
}
