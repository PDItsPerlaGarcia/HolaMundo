public class StringEjemplos {
    public static void main(String[] args) {
        String curso = "Perla García";
        String curso2 = new String("Perla García");

        //Comparar con == te da falso si se declara de manera diferente, aunque sea igual
        boolean validar = curso == curso2;
        System.out.println("validar = " + validar);

        //Compara con equals o equalsIgnoreCase validara de forma efectiva aunque se declare de forma diferente
        validar = curso.equals(curso2);
        System.out.println("con equals validar = " + validar);

        String nom1 = "si";
        String nom2 = "SI";
        validar = nom1.equalsIgnoreCase(nom2);
        System.out.println("con equalsIgnoraCase validar = " + validar);

    }
}
