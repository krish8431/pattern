import java.util.Scanner;

public class UserInputScanner{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name =s.nextLine();
        System.out.println("Enter Your Age :");
        int age =s.nextInt();
        System.out.println("Enter Your Gender :"); 
        char gender =s.next().charAt(0);
        System.out.println("Enter Your Phone No. :");
        long phoneno=s.nextLong();
        s.nextLine();

        System.out.println("Enter Your Address");
        String address=s.nextLine();
        System.out.println("Enter Your Blood Group");
        String bloodgroup=s.next();
        System.out.println("******************************************");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Gender :" + gender);
        System.out.println("Phone No. :" + phoneno);
        System.out.println("Address :" + address);
        System.out.println("Blood Type :" + bloodgroup);
    }
}