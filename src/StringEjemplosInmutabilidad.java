public class StringEjemplosInmutabilidad {
    public static void main(String[] args) {
        String curso = "Perla García";
        String curso2 = new String(" y Perla García");

        String resultado = curso.concat(curso2);
        System.out.println("resultado = " + resultado);

        String resultado2 =  curso.transform(c -> {
            return c + " la mas bonita" + curso2;
        });

        System.out.println("resultado2 = " + resultado2);

        String res3 = curso.replace("a", "O");
        System.out.println("res3 = " + res3);

    }
}
