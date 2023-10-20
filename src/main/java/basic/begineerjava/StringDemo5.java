package basic.begineerjava;

public class StringDemo5 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Jahid");
        System.out.println(sb);

        sb.append(" Hasan");
        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
