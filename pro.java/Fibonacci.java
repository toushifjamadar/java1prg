import java.util.Scanner;
class Fibonacci 
   {
    public static void main(String args[]) 
    {
        int n, a = 0,c = 1;
        Scanner s = new Scanner(System.in);
        Scanner.out.println("Enter value of n:"); 
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1;i < n;i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }

    }
    
    
}
