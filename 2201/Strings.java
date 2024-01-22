public class Strings {
    public static void main(String[] args){
        String n1="Suresh";
        String n2="Suresh";
        String n3="SURESH";
        System.out.println(n1==n2);
        System.out.println(n1==n3);
        String n4=new String("Suresh");
        String n5=new String("Suresh");
        System.out.println(n1==n4);
        System.out.println(n4==n5);
        System.out.println(n4.equals(n5));
        System.out.println(n3.equalsIgnoreCase(n5));
        String n6=new String("Suresh is a trainer");
        System.out.println(n6.toUpperCase());
        System.out.println(n6.toLowerCase());
        System.out.println(n6.charAt(0));
        System.out.println(n6.contains("Trainer"));
        System.out.println(n6.length());
        System.out.println(n6.trim());
        System.out.println(n6.trim().length());
        System.out.println(n6.endsWith("r"));
        System.out.println(n6.startsWith("S"));
        String text[]=n6.split("\s");
        for(String s : text){
            System.out.println(s);
        }
        System.out.println("=======:"+n4);
        
    }
}
