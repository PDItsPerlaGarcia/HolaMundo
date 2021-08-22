import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numDecimal = 0;
        try{
            numDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Esta tratando de capturar letras. Solo capture numeros enteros");
            main(args);
            System.exit(0);
        }

        //para marcar se pone 0b al inicio que es binario pero cuando imprime lo imprime como decimal
        int numBin = 0b1010;
        System.out.println("numBin = " + numBin);

        //int numBin = Integer.parseInt(Integer.toBinaryString(numDecimal));
        //System.out.println("numBin = " + numBin);

        //para marcar que es octal se agrega el cero al inicio y se imprime como decimal
        int numOctal = 012;
        System.out.println("numOctal = " + numOctal);

        //para indicar en hexadecimal 0x antes para que lo imprima como decimal
        int numHex = 0x78;
        System.out.println("numHex = " + numHex);

        String mensaje = "numDecimal a binario: " + numDecimal + " = " + Integer.toBinaryString(numDecimal);
        mensaje += "\nnumDecimal a octal: " + numDecimal + " = " + Integer.toOctalString(numDecimal);
        mensaje += "\nnumDecimal a hexadecimal: " + numDecimal + " = " + Integer.toHexString(numDecimal);

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
