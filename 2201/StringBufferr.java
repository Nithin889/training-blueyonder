public class StringBufferr {
    public static void main(String[] args) {
        String s1=new String("Sachin");
        s1.concat("Kumar");
        System.out.println(s1);
        StringBuffer sb=new StringBuffer("Sachin");
        sb.append(" kumar");
        System.out.println(sb);
        //System.out.println(sb.reverse());
        System.out.println(sb.insert(0,"Mr "));
        System.out.println(sb);
        System.out.println(sb.delete(0,3));
    }
}
