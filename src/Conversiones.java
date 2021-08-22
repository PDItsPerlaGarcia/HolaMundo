public class Conversiones {
    public static void main(String[] args) {
        String boo = "True";
        boolean prueba = Boolean.parseBoolean(boo);
        System.out.println("prueba = " + prueba);

        int numero = 124;
        String conver = String.valueOf(numero+45);
        System.out.println("conver = " + conver);

    }
}
