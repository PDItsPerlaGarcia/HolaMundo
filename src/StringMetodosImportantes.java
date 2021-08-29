import java.util.Locale;

public class StringMetodosImportantes {
    public static void main(String[] args) {
        String nom =  "Perla Denisse";

        System.out.println("nom.length() = " + nom.length());
        System.out.println("nom.toLowerCase() = " + nom.toLowerCase());
        System.out.println("nom.toUpperCase() = " + nom.toUpperCase());
        System.out.println("nom.equals(\"Perla\") = " + nom.equals("Perla"));
        System.out.println("nom.equals(\"Perla\") = " + nom.equals("perla"));
        System.out.println("nom.equalsIgnoreCase(\"perla\") = " + nom.equalsIgnoreCase("perla"));
        System.out.println("nom.compareTo(\"Perla\") = " + nom.compareTo("Perla"));
        System.out.println("nom.compareTo(\"perla\") = " + nom.compareTo("perla"));
        System.out.println("nom.charAt(0) = " + nom.charAt(0));
        System.out.println("nom.charAt(1) = " + nom.charAt(1));
        System.out.println("nom.charAt(nom.length()-1) = " + nom.charAt(nom.length()-1));

        System.out.println("nom.substring(1) = " + nom.substring(1));
        System.out.println("nom = " + nom.substring(1,4));
        System.out.println("nom.substring(nom.length()-1) = " + nom.substring(nom.length()-1));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"guas\") = " + trabalenguas.indexOf("guas"));
        System.out.println("trabalenguas.contains(\"gu\") = " + trabalenguas.contains("gu"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));

        //obtener el tipo de documento que es
        String arrchivo = "foto.png";
        int punto = arrchivo.lastIndexOf(".");
        System.out.println("El archivo es: "+ arrchivo.substring(punto, arrchivo.length()));


    }
}
