abstract class A{
    int x=5;
    private abstract void hello();
}
class Static{
    public static void main(String[] args) {
        A.x=2;
        System.out.println(A.x);
    }
}