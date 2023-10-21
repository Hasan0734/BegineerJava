package basic.begineerjava;

public class NumberConversionDemo {

    public static void main(String[] args) {
        //convert  binary, octal, hexadecimal to decimal number

        String binary = "101011";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        String octal = "675";
        Integer num = Integer.parseInt(octal, 8);
        System.out.println(num);

        String hexadecimal = "A";
        Integer num2 = Integer.parseInt(hexadecimal, 16);
        System.out.println(num2);

        //convert decimal to binary, octal, hexadecimal number
        int d = 15;

        String binary2 = Integer.toBinaryString(d);
        System.out.println("Binary = " + binary2);

        String octal2 = Integer.toOctalString(d);
        System.out.println("Binary = " + octal2);

        String hexa = Integer.toHexString(d);
        System.out.println("Binary = " + hexa);

    }
}
