import java.util.*;
import java.io.*;

class Main {

    public static String CodelandUsernameValidation(String str) {
        // code goes here
        int flag = 0;
        if(str.length() >= 4 && str.length() <= 25){
            char[] arr = str.toCharArray();
            if(Character.isAlphabetic(arr[0])){
                for(int i = 0; i <= arr.length; i++){

                    if((Character.isAlphabetic(arr[i]) || Character.isDigit(arr[i]) || arr[i]== '_') &&  !(str.endsWith("_"))  ){
                        flag = 100;
                    }
                    else{
                        System.out.println("false");
                        break;
                    }

                }
                if(flag == 100){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }

            }
            else{
                System.out.println("false");
            }



        }
        else{
            System.out.println("false");
        }

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}