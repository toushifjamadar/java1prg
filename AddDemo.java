 class Addition {
    void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("The sum is"+sum);
    }
    void add(double a,double b)
    {
        double sum=a+b;
        System.out.println("The sum is="+sum);
    }
    void add(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("sum="+sum);
    }
    void add(String s1,String s2)
    {
        String  s3=s1+s2;
        System.out.println("The String is="+s3);
    }

}
 public class AddDemo
{
    public static void main(String[] args) {
        Addition obj=new Addition();
         obj.add(10,20);
         obj.add(12,20,29);
         obj.add(18,39,49);
         obj.add("Hello","world");
    }


}
