import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);

        String word;
        int tam;

        System.out.print("Capture la palabra: ");
        word = buffer.nextLine();
        System.out.println("word.length() = " + word.length());
        tam = word.length()-1;


        char[] arr = new char[word.length()];
        System.out.println("entro");

        for(int i = 0; i <= word.length()-1; i++){
            arr[i] = word.charAt(word.length()-(1+i));

        }

        String nueva = String.copyValueOf(arr);
        System.out.println(nueva);

        if(word.equals(nueva)){
            System.out.println("La palabra "+word+" es un palindromo");
        }
        else{
            System.out.println("La palabra "+word+" no es un palindromo ");
        }

    }
}
