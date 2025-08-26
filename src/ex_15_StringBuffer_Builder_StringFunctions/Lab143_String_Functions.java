package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String args[])
    {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10));

        System.out.println(name.concat("Patel"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("Sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));

        System.out.println(name.indexOf("o"));

        System.out.println("String -> madam");

        String s1 = "madam";
        System.out.println(s1.indexOf('m'));
        System.out.println(name.length());

        System.out.println(name.replace('n','N')); // it will print SoNal
        System.out.println("Value of name is " + name);
        System.out.println(name.substring(1,3));
        System.out.println("SONAL".toLowerCase());
        System.out.println("sonal".toUpperCase());

        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("n"));

        String name3="    Sonal Harish    ";
        System.out.println(name3.trim()); //it will remove spaces in the beginning and in the end
        System.out.println(name.compareTo("Sonal")); //it will match both the strings and will print 0

        System.out.println("Using StringBuilder");

        //Using StringBuilder
        StringBuilder stringbuilder = new StringBuilder("Sonal");
        System.out.println(stringbuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String name5 = anotherPalindrome.substring(11,15);
        System.out.println(name5);
    }
}
