public class DecrementoIncremento {
    public static void main(String[] args) {
        //pre incremento
        int i = 5;
        int j = ++i;

        // i vale 6, j valdra igual 6
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //pos incremento
        i = 12;
        j = i++;

        // i vale 13, j valdra igual 12
        System.out.println("j = " + j);
        System.out.println("i = " + i);



    }

}
