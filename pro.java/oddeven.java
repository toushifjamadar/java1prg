import java. util.Scanner;
public class oddeven {
    public static void main(String[] args) {
         int n;
         Scanner Sc=new Scanner(System.in);
         System.out.println("Enter the number");
         n=Sc.nextInt();
         if (n%2==0){
            System.out.println("The given number is Even");
        }
        else
        {
            System.out.println("The given number is Odd");
        }

    }
    
}
