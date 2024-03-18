public class removechar{
    public static void main(String args []){
    String A= "Hello&123";
    A= A+ "World";
    System.out.println(A.replace("&123", ""));
    }
}