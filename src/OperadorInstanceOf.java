public class OperadorInstanceOf {
    public static void main(String[] args) {
        String ejemplo = "do you hear my scream?";

        Integer num = 3;

        boolean b1 = ejemplo instanceof String;
        boolean b2 = ejemplo instanceof Object;
        boolean b3 = num instanceof Integer;
        boolean b4 = num instanceof Number;

        System.out.println("ejemplo es del tipo String = " + b1);
        System.out.println("ejemplos es del tipo object = " + b2);
        System.out.println("num es del tipo integer = " + b3);
        System.out.println("num es del tipo number = " + b4);
    }
}
