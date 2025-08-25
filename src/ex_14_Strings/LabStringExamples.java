package ex_14_Strings;

public class LabStringExamples {
    public static void main(String args[])
    {
        String name ="Java";
        char c = name.charAt(2);
        System.out.println(c);
        System.out.println(name.codePointAt(0)); // it will print ASCII value of J

        int result = "abc".compareTo("ABC");
        System.out.println(result);
        int result2 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result2);

        int idx = "Java".indexOf("a");
        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx); // it will print 1
        System.out.println(idx2); // it will print 3

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("z-","Java","Python");
        System.out.println(s11); // it will print Javaz-Python

        String s12 = "Java".replace('a','o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);
    }
}
